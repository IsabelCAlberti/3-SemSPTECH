//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Perfume extends Produto {
    private String fragrancia;

    public Perfume(int codigo, String descricao, double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    public double getValorTributo() {
        return 0.27 * this.getPreco();
    }

    public String toString() {
        return "Perfume{ fragrancia='" + this.fragrancia + "'}";
    }
}
