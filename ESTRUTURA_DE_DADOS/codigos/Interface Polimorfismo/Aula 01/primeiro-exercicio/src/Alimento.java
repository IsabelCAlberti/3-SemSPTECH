//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Alimento extends Produto {
    private int quantVitamina;

    public Alimento(int codigo, String descricao, double preco, int quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    public double getValorTributo() {
        return 0.15 * this.getPreco();
    }

    public String toString() {
        return "Alimento{ quantVitamina=" + this.quantVitamina + "}";
    }
}
