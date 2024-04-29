package abstrataexemplo;

public class Bebida extends ItemMenu{
    private Double mililitros;

    public Bebida(String nome, Double preco, Double mililitros) {
        super(nome, preco);
        this.mililitros = mililitros;
    }

    @Override
    public void verDetalhes() {
        System.out.println(String.format("""
                Nome: %s
                Essa é uma bebida de %.1f mls
                """,getNome(),mililitros));
    }

    public Double getMililitros() {
        return mililitros;
    }

    public void setMililitros(Double mililitros) {
        this.mililitros = mililitros;
    }
}
