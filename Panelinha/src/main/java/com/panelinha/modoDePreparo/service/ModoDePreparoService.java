package com.panelinha.modoDePreparo.service;

import com.panelinha.ingrediente.model.Ingrediente;
import com.panelinha.modoDePreparo.dto.ModoDePreparoDto;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;
import com.panelinha.modoDePreparo.mapper.ModoDePreparoMapper;
import com.panelinha.modoDePreparo.model.ModoDePreparo;
import com.panelinha.modoDePreparo.repository.ModoDePreparoRepository;
import com.panelinha.receita.model.Receita;
import com.panelinha.receita.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModoDePreparoService {
    private final ModoDePreparoRepository modoDePreparoRepository;
    private final ModoDePreparoMapper modoDePreparoMapper;
    private final ReceitaRepository receitaRepository;

    public ModoDePreparoService(ModoDePreparoRepository modoDePreparoRepository, ModoDePreparoMapper modoDePreparoMapper, ReceitaRepository receitaRepository) {
        this.modoDePreparoRepository = modoDePreparoRepository;
        this.modoDePreparoMapper = modoDePreparoMapper;
        this.receitaRepository = receitaRepository;
    }
    public List<ModoDePreparoResponseDto> findAll(){
        return modoDePreparoRepository.findAll()
                .stream()
                .map(modoDePreparoMapper::toResponseDto)
                .toList();
    }

    public ModoDePreparoResponseDto finById(Long id){
        return modoDePreparoRepository.findById(id)
                .map(modoDePreparoMapper::toResponseDto)
                .orElseThrow(() -> new RuntimeException("Modo de preparo não encontrado"));
    }

    public ModoDePreparoResponseDto create(ModoDePreparoDto modoDePreparoDto){
        Receita receita = receitaRepository.findById(modoDePreparoDto.receitaId())
                .orElseThrow(() ->
                        new RuntimeException("Receita não encontrada"));

        ModoDePreparo modoDePreparo = modoDePreparoMapper.toEntity(modoDePreparoDto);

        modoDePreparo.setReceita(receita);

        ModoDePreparo modoDePreparoeSalvo =
                modoDePreparoRepository.save(modoDePreparo);
        return modoDePreparoMapper.toResponseDto(modoDePreparoeSalvo);
    }

}
