package com.fiap.soat.foodsystem.core.domain.entities;

import com.fiap.soat.foodsystem.core.domain.enums.StatusPagamento;
import com.fiap.soat.foodsystem.core.domain.enums.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private Cliente cliente;
    private List<PedidoProduto> listaPedidoProdutos = new ArrayList<>();
    private StatusPedido statusPedido;
    private BigDecimal valorTotalPedido;
    private String observacao;
    private LocalDateTime dataHoraCriacao;
    private List<Pagamento> pagamentos = new ArrayList<>();

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoProduto> getListaPedidoProdutos() {
        return listaPedidoProdutos;
    }

    public void setListaPedidoProdutos(List<PedidoProduto> listaPedidoProdutos) {
        this.listaPedidoProdutos = listaPedidoProdutos;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public BigDecimal getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}

