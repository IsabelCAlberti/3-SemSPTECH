package com.sptech.projeto04;

import javax.validation.constraints.*;

public class Medicamentos {

    /*a) POST /medicamentos, que recebe um corpo de requisição como do exemplo:
{

    "valorUnd": 5.50, // -> obrigatório e deve ser maior ou igual a 0.0
    "quantidade": 90, // -> obrigatório e deve ser maior ou igual a 0
    "precisaReceita": false // -> opcional, mas o padrão é false caso não informado
}*/
@NotBlank
@Size(min = 3, max=5)
    private String codigo;
    @NotBlank
    @Size(min = 4, max=30)
    private String nome;
    @NotBlank
    @DecimalMin("0.0")
    @PositiveOrZero
    private Double valorUnid;
    @NotBlank
    @DecimalMin("0.0")
    @PositiveOrZero
    private Integer quantidade;

    private boolean precisaReceita;  // primitivo booblean inicia sempre em false
   // private Boolean precisaReceita = false;


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnid() {
        return valorUnid;
    }

    public void setValorUnid(Double valorUnid) {
        this.valorUnid = valorUnid;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getPrecisaReceita() {
        return precisaReceita;
    }

    public void setPrecisaReceita(Boolean precisaReceita) {
        this.precisaReceita = precisaReceita;
    }
}
