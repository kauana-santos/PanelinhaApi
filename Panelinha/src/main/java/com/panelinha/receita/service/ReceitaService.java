package com.panelinha.receita.service;

import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.mapper.ReceitaMapper;
import com.panelinha.receita.model.Receita;
import com.panelinha.receita.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    private final ReceitaRepository repository;
    private final ReceitaMapper receitaMapper;

    public ReceitaService(ReceitaRepository repository, ReceitaMapper receitaMapper) {
        this.repository = repository;
        this.receitaMapper = receitaMapper;
    }

    public List<ReceitaResponseDto> findAll(){
        return repository.findAll()
                .stream()
                .map(receitaMapper::toResponseDto)
                .toList();
    }

    public  ReceitaResponseDto findById(Long id){
        return repository.findById(id)
                .map(receitaMapper::toResponseDto)
                .orElseThrow(() -> new RuntimeException("Receita não encontrada"));
    }

    public ReceitaResponseDto create(ReceitaDto receitaDto){
        Receita receita = receitaMapper.toEntity(receitaDto);
        Receita receitaSalva = repository.save(receita);
        return receitaMapper.toResponseDto(receitaSalva);
    }
}
