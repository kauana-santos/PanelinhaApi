package com.panelinha.modoDePreparo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ModoDePreparoDto(
        @NotBlank(message = "O nome da receita é obrigatório")
        String titulo,
        @NotBlank(message = "A descrição da receita é obrigatória")
        String descricao,

        @NotNull(message = "O id da receita é obrigatório")
        Long receitaId
) {
}
