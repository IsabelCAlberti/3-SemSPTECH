package abstrataexemplo;
// Atributos
// Construtor
// Métodos
// Métodos Get & Set
// Método toString
public abstract class ItemMenu {
    private String nome;
    private Double preco;

    public ItemMenu(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void verDetalhes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
