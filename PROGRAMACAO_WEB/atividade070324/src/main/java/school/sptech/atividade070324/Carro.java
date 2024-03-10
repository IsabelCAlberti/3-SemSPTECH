package school.sptech.atividade070324;

import jakarta.validation.constraints.*;

import java.util.UUID;

public class Carro {

    private final UUID id = UUID.randomUUID();
    @NotBlank
    private String marca;
    @NotBlank
    private String modelo;
    private String cor;
    @NotBlank
    @Size(min = 7, max = 8)
    private String placa;
    @Min(1960)
    private Integer ano;
    @DecimalMin("0.01")
    private Double preco;

    private String motivoMudancaPlaca;


    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getMotivoMudancaPlaca() {
        return motivoMudancaPlaca;
    }

    public void setMotivoMudancaPlaca(String motivoMudancaPlaca) {
        this.motivoMudancaPlaca = motivoMudancaPlaca;
    }
}