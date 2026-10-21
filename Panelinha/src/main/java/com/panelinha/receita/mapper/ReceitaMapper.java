package com.panelinha.receita.mapper;

import com.panelinha.ingrediente.mapper.IngredienteMapper;
import com.panelinha.modoDePreparo.mapper.ModoDePreparoMapper;
import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.model.Receita;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        uses = {
                IngredienteMapper.class,
                ModoDePreparoMapper.class
        }
)
public interface ReceitaMapper {

    Receita toEntity(ReceitaDto dto);

    ReceitaResponseDto toResponseDto(Receita receita);
}