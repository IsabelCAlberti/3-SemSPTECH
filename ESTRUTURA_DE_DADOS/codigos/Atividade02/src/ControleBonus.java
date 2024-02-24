import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonus> funcionariosComBonus = new ArrayList<>();

    public void adicionarFuncionario(Bonus funcionario) {
        funcionariosComBonus.add(funcionario);
    }

    public void exibirLista() {
        for (Bonus funcionario : funcionariosComBonus) {
            System.out.println(funcionario);
        }
    }

    public double calcularTotalBonus() {
        double total = 0;
        for (Bonus funcionario : funcionariosComBonus) {
            total += funcionario.valorBonus();
        }
        return total;
    }
}
