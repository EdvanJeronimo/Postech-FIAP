package com.fiap.soat.foodsystem.adapters.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoReceived {

    @NumberFormat
    private Long id;
    @NumberFormat
    private Long idCliente;
    @NotNull(message = "Lista de produtos não pode ser nula")
    private List<PedidoProdutoReceived> listaPedidoProduto;
    @NumberFormat
    private BigDecimal valorTotal;
    @Size(max = 500, message = "Observação deve ter no máximo 500 caracteres")
    private String observacao;
}
