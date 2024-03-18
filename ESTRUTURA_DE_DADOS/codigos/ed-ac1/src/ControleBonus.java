import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Calculavel> funcionariosEAcionistas = new ArrayList<>();

    public void adicionarFuncionario(FuncionarioHoraExtra funcionario) {

        funcionariosEAcionistas.add(funcionario);
    }

    public void adicionarFuncionarioHorista(FuncionarioHorista funcionario) {
        funcionariosEAcionistas.add(funcionario);
    }

    public void adicionarAcionista(Acionista acionista) {
        funcionariosEAcionistas.add(acionista);
    }

    public double calcularTotalBonus() {
        double totalBonus = 0;
        for (Calculavel funcionarioEAcionista : funcionariosEAcionistas) {
            totalBonus += funcionarioEAcionista.getValorBonus();
        }
        return totalBonus;
    }

    public void exibirTodosBonus() {
        for (Calculavel funcionarioEAcionista : funcionariosEAcionistas) {
            System.out.println(funcionarioEAcionista);
        }
    }
}

