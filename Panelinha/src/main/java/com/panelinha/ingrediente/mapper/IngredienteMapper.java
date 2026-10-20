package com.panelinha.ingrediente.mapper;

import com.panelinha.ingrediente.dto.IngredienteDto;
import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.ingrediente.model.Ingrediente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IngredienteMapper {
    @Mapping(target = "receita", ignore = true)
    Ingrediente toEntity(IngredienteDto dto);

    IngredienteResponseDto toResponseDto(Ingrediente ingrediente);
}
