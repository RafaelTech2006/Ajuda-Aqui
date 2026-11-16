package br.com.ajudaaqui.model.dto;

import jakarta.validation.constraints.NotBlank;

public record RotaDTO(
        @NotBlank(message = "Este campo deve ser preenchido.")
        String origem,
        @NotBlank(message = "Este campo deve ser preenchido.")
        String destino,
        @NotBlank(message = "Este campo deve ser preenchido.")
        String descricao
) {
}
