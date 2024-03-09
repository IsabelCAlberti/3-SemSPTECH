package sptech.projetocarros;

import jakarta.validation.constraints.Min;

import java.util.List;

public class CarroSimples {

    private String marcaModelo;

    private Double preco;

    private Integer ano;
    private Double IPVA;

    public CarroSimples(Carro carro) {
        this.marcaModelo = "%s %s".formatted(carro.getMarca(), carro.getModelo());
        this.preco = carro.getPreco();
        this.ano = carro.getAno();
        this.IPVA = ano >= 2000 ? preco * 0.05 : 0.0;
    }

    public static List<CarroSimples> deLista(List<Carro> carros) {
        return carros.stream().map(CarroSimples::new).toList();
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getIPVA() {
        return IPVA;
    }
}
