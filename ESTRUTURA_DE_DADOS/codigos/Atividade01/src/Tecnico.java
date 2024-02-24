import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tecnico implements Pagavel {
    protected String nome;
    protected int tempoServico;
    private double salarioBase;
    private List<String> estrategias = new ArrayList<>();
    private List<String> jogadoresCorinthians = new ArrayList<>(List.of("Cássio", "Carlos Miguel", "Matheus Donelli", "Hugo", "Diego Palácios", "Fagner", "Lucas Veríssimo", "Félix Torres", "Caetano", "Gustavo Henrique", "Maycon", "Raniele", "Fausto Vera", "Matías Rojas", "Matheus Araújo", "Yuri Alberto", "Romero", "Gustavo Mosquito"));


    public Tecnico(String nome, int tempoServico, double salarioBase) {
        this.nome = nome;
        this.tempoServico = tempoServico;
        this.salarioBase = salarioBase;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<String> getEstrategias() {
        return estrategias;
    }

    public void setEstrategias(List<String> estrategias) {
        this.estrategias = estrategias;
    }

    public List<String> getJogadoresCorinthians() {
        return jogadoresCorinthians;
    }

    public void setJogadoresCorinthians(List<String> jogadoresCorinthians) {
        this.jogadoresCorinthians = jogadoresCorinthians;
    }

    public void definirEstrategia() {
        estrategias.add("Estratégia 442");
        estrategias.add("Estratégia 4312");
        estrategias.add("Estratégia 3421");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma estratégia: ");
        for (int i = 0; i < estrategias.size(); i++) {
            System.out.println((i + 1) + ". " + estrategias.get(i));
        }
        int escolha = scanner.nextInt();
        System.out.println("O técnico definiu a seguinte estratégia: " + estrategias.get(escolha - 1));
    }

    public void fazerSubstituicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja fazer alguma substituição? Sim ou Não ");
        String escolhaSubstituir = scanner.next();
        if (escolhaSubstituir.equalsIgnoreCase("Sim")) {
            System.out.println(getJogadoresCorinthians());
            System.out.println("Qual jogador irá substituir?");
            String jogadorSubstituir = scanner.next();
            if (jogadoresCorinthians.contains(jogadorSubstituir)) {
                System.out.println("Por qual jogador você quer substituir " + jogadorSubstituir + "?");
                String novoJogador = scanner.next();
                int index = jogadoresCorinthians.indexOf(jogadorSubstituir);
                jogadoresCorinthians.set(index, novoJogador);
                System.out.println(jogadorSubstituir + " foi substituído por " + novoJogador);
            } else {
                System.out.println("O jogador " + jogadorSubstituir + " não está na lista.");
            }
        }
    }
    @Override
    public double calcularSalario() {
        return 0;
    }
}
