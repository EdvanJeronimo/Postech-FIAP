package com.fiap.soat.foodsystem.adapters.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaReceived {
    private Long id;
    @NotBlank(message = "Nome da categoria não pode ser vazia")
    @NotNull(message = "Nome da categoria não pode ser nula")
    @Size(min = 3, max = 20, message = "Nome deve ter entre 3 e 20 caracteres")
    private String nome;
    private boolean statusAtivo;
}
