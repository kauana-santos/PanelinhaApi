package com.panelinha.ingrediente.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record IngredienteResponseDto(
        Long id,

        String titulo,

        String descricao,

        Integer quantidade
) {
}
