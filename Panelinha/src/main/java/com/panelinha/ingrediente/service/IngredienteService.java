package com.panelinha.ingrediente.service;

import com.panelinha.ingrediente.dto.IngredienteDto;
import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.ingrediente.mapper.IngredienteMapper;
import com.panelinha.ingrediente.model.Ingrediente;
import com.panelinha.ingrediente.repository.IngredienteRepository;
import com.panelinha.receita.model.Receita;
import com.panelinha.receita.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredienteService {
    private final IngredienteRepository ingredienteRepository;
    private final IngredienteMapper ingredienteMapper;
    private final ReceitaRepository receitaRepository;

    public IngredienteService(IngredienteRepository ingredienteRepository, IngredienteMapper ingredienteMapper, ReceitaRepository receitaRepository) {

        this.ingredienteRepository = ingredienteRepository;
        this.ingredienteMapper = ingredienteMapper;
        this.receitaRepository = receitaRepository;
    }

    public List<IngredienteResponseDto> findAll(){
        return ingredienteRepository.findAll()
                .stream()
                .map(ingredienteMapper::toResponseDto)
                .toList();
    }

    public IngredienteResponseDto findById(Long id){
        return ingredienteRepository.findById(id)
                .map(ingredienteMapper::toResponseDto)
                .orElseThrow(() -> new RuntimeException("Ingrediente não encontrado"));
    }

    public IngredienteResponseDto create(IngredienteDto dto) {

        Receita receita = receitaRepository.findById(dto.receitaId())
                .orElseThrow(() ->
                        new RuntimeException("Receita não encontrada"));

        Ingrediente ingrediente = ingredienteMapper.toEntity(dto);

        ingrediente.setReceita(receita);

        Ingrediente ingredienteSalvo =
                ingredienteRepository.save(ingrediente);

        return ingredienteMapper.toResponseDto(ingredienteSalvo);
    }
}
