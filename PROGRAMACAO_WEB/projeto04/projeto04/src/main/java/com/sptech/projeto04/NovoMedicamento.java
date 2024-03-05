package com.sptech.projeto04;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

public class NovoMedicamento {
    @NotNull
    @DecimalMin("0.0")
    private Double novoValorUnd;

    @NotNull
    @DecimalMin("0")
    private Integer quantidadeEntrada;

    public Double getNovoValorUnd() {
        return novoValorUnd;
    }

    public void setNovoValorUnd(Double novoValorUnd) {
        this.novoValorUnd = novoValorUnd;
    }

    public Integer getQuantidadeEntrada() {
        return quantidadeEntrada;
    }

    public void setQuantidadeEntrada(Integer quantidadeEntrada) {
        this.quantidadeEntrada = quantidadeEntrada;
    }
}
