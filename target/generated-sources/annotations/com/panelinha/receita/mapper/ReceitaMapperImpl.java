package com.panelinha.receita.mapper;

import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.model.Receita;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-20T13:55:38-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Amazon.com Inc.)"
)
@Component
public class ReceitaMapperImpl implements ReceitaMapper {

    @Override
    public Receita toEntity(ReceitaDto dto) {
        if ( dto == null ) {
            return null;
        }

        Receita receita = new Receita();

        receita.setTitulo( dto.titulo() );
        receita.setDescricao( dto.descricao() );

        return receita;
    }

    @Override
    public ReceitaResponseDto toResponseDto(Receita receita) {
        if ( receita == null ) {
            return null;
        }

        Long id = null;
        String titulo = null;
        String descricao = null;

        id = receita.getId();
        titulo = receita.getTitulo();
        descricao = receita.getDescricao();

        ReceitaResponseDto receitaResponseDto = new ReceitaResponseDto( id, titulo, descricao );

        return receitaResponseDto;
    }
}
