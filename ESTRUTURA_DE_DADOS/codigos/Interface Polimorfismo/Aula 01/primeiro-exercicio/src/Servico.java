//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Servico implements Tributavel {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getValorTributo() {
        return 0.12 * this.getPreco();
    }

    public String toString() {
        return "Servico{ descricao='" + this.descricao + "', preco=" + this.preco + "}";
    }
}
