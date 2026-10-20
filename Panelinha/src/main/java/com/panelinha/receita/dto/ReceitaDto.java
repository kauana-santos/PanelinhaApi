package com.panelinha.receita.dto;

import com.panelinha.ingrediente.dto.IngredienteDto;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ReceitaDto(
        @NotBlank(message = "O nome da receita é obrigatório")
        String titulo,
        @NotBlank(message = "A descrição da receita é obrigatória")
        String descricao
) {
}
