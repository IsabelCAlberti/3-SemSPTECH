package abstrataexemplo;

public class PratoPrincipal extends ItemMenu{
    private String diaSemana;

    public PratoPrincipal(String nome, Double preco, String diaSemana) {
        super(nome, preco);
        this.diaSemana = diaSemana;
    }

    @Override
    public void verDetalhes() {
        System.out.println(String.format("""
                O prato de %s é %s
                """, diaSemana, getNome()));
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
