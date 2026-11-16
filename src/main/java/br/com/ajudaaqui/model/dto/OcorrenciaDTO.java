package br.com.ajudaaqui.model.dto;

import jakarta.validation.constraints.NotBlank;

public record OcorrenciaDTO(
        @NotBlank(message = "Este campo deve ser preenchido.")
        String titulo,
        @NotBlank(message = "Este campo deve ser preenchido.")
        String descricao,
        @NotBlank(message = "Este campo deve ser preenchido.")
        String status
) {
}
