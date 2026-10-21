package com.panelinha.receita.dto;

import jakarta.validation.constraints.NotBlank;

public record ReceitaDto(
        @NotBlank(message = "O nome da receita é obrigatório")
        String titulo,
        @NotBlank(message = "A descrição da receita é obrigatória")
        String descricao,
        @NotBlank(message = "A url da imagem é obrigatória")
        String imageUrl
) {
}
