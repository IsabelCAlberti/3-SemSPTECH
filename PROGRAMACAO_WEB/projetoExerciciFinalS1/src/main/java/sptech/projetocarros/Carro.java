package sptech.projetocarros;

import jakarta.validation.constraints.*;

import java.util.UUID;

public class Carro {
    private UUID id = UUID.randomUUID();

    @NotBlank
    private String marca;

    @NotBlank
    private String modelo;
    private String cor;
    @NotBlank
    @Size(min = 7, max = 8)
    private String placa;

    @DecimalMin("0.01")
    private Double preco;

    @Min(1960)
    private Integer ano;

    private String motivoMudancaPlaca;

    public UUID getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getAno() {
        return ano;
    }

    public void setMotivoMudancaPlaca(String motivoMudancaPlaca) {
        this.motivoMudancaPlaca = motivoMudancaPlaca;
    }

    public String getMotivoMudancaPlaca() {
        return motivoMudancaPlaca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
