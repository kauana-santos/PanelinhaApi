package com.panelinha.receita.dto;

import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;

import java.util.List;

public record ReceitaResponseDto(
        Long id,
        String titulo,
        String descricao,
        List<IngredienteResponseDto> ingredientes,
        List<ModoDePreparoResponseDto> modoDePreparo

) {
}
