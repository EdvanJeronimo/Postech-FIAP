package com.fiap.soat.foodsystem.adapters.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoResponse {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private CategoriaResponse categoria;
    private boolean statusAtivo;
    private LocalDateTime dataHoraCriacao;
}
