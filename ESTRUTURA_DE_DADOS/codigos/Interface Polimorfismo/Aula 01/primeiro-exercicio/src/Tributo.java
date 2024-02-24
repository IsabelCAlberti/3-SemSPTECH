import java.util.ArrayList;

public class Tributo {
    private ArrayList<Tributavel> listaTrib = new ArrayList();

    public Tributo() {
        this.listaTrib = new ArrayList();
    }

    public void adicionaTributavel(Tributavel t) {
        this.listaTrib.add(t);
    }

    public double calculaTotalTributo() {
        double totalTributo = 0.0;
        for (Tributavel t : this.listaTrib) {
            totalTributo += t.getValorTributo();
        }
        return totalTributo;
    }

    public void exibeTodos() {
        for (Tributavel t : this.listaTrib) {
            System.out.println(t);
        }
    }

}