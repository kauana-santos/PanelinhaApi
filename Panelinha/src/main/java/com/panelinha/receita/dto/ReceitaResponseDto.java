package com.panelinha.receita.dto;

import com.panelinha.ingrediente.dto.IngredienteDto;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ReceitaResponseDto(
        Long id,
        String titulo,
        String descricao
) {
}
