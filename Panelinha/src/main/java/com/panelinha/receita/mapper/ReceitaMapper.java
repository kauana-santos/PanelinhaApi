package com.panelinha.receita.mapper;

import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.model.Receita;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReceitaMapper {
    Receita toEntity(ReceitaDto dto);


    ReceitaResponseDto toResponseDto(Receita receita);


}
