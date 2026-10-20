package com.panelinha.ingrediente.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record IngredienteDto(
        @NotBlank(message = "O nome do ingrediente é obrigatório")
        String titulo,

        String descricao,

        @NotNull(message = "A quantidade do ingrediente é obrigatória")
        Integer quantidade,

        Long receitaId
) {
}
