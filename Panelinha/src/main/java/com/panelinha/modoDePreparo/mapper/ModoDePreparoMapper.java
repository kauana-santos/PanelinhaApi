package com.panelinha.modoDePreparo.mapper;


import com.panelinha.modoDePreparo.dto.ModoDePreparoDto;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;
import com.panelinha.modoDePreparo.model.ModoDePreparo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ModoDePreparoMapper {

    @Mapping(target = "receita", ignore = true)
    ModoDePreparo toEntity(ModoDePreparoDto dto);

    ModoDePreparoResponseDto toResponseDto(ModoDePreparo modoDePreparo);
}
