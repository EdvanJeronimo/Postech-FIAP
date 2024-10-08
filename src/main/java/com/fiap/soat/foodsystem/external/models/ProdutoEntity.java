package com.fiap.soat.foodsystem.external.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "Produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(nullable = false, length = 80)
    private String nome;
    @NotNull
    @Column(nullable = false, length = 500)
    private String descricao;
    @NotNull
    @Column(nullable = false, scale = 2, precision = 10)
    private BigDecimal preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "FK_Categoria"))
    private CategoriaEntity categoria;
    @NotNull
    @Column(nullable = false)
    private boolean statusAtivo;
    @Column(nullable = false)
    private LocalDateTime dataHoraCriacao;

}
