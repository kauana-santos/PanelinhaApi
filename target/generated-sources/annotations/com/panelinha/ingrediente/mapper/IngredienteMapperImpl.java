package com.panelinha.ingrediente.mapper;

import com.panelinha.ingrediente.dto.IngredienteDto;
import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.ingrediente.model.Ingrediente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-26T08:49:39-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Amazon.com Inc.)"
)
@Component
public class IngredienteMapperImpl implements IngredienteMapper {

    @Override
    public Ingrediente toEntity(IngredienteDto dto) {
        if ( dto == null ) {
            return null;
        }

        Ingrediente ingrediente = new Ingrediente();

        ingrediente.setTitulo( dto.titulo() );
        ingrediente.setDescricao( dto.descricao() );
        ingrediente.setQuantidade( dto.quantidade() );

        return ingrediente;
    }

    @Override
    public IngredienteResponseDto toResponseDto(Ingrediente ingrediente) {
        if ( ingrediente == null ) {
            return null;
        }

        Long id = null;
        String titulo = null;
        String descricao = null;
        Integer quantidade = null;

        id = ingrediente.getId();
        titulo = ingrediente.getTitulo();
        descricao = ingrediente.getDescricao();
        quantidade = ingrediente.getQuantidade();

        IngredienteResponseDto ingredienteResponseDto = new IngredienteResponseDto( id, titulo, descricao, quantidade );

        return ingredienteResponseDto;
    }
}
