import java.util.Scanner;

public class Atacante extends Jogador{
    public Atacante(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }


    public void exibirOpcoesJogadores() {
        System.out.println("Escolha um jogador para bater o pênalti:");
        Tecnico tt = new Tecnico("", 10,4000);
        for (int i = 0; i < tt.getJogadores().size(); i++) {
            System.out.printf("%d. %s\n", i + 1,tt.getJogadores().get(i));
        }
    }

    public int obterEscolhaJogador(Scanner scanner, int tamanhoLista) {
        int escolha;
        do {
            System.out.print("Escolha (1 a " + tamanhoLista + "): ");
            escolha = scanner.nextInt();
        } while (escolha < 1 || escolha > tamanhoLista);
        return escolha;
    }

    public boolean continuarJogo(Scanner scanner) {
        System.out.print("Deseja continuar? (S/N): ");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("S");
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
    @Override
    public double calcularSalario(Goleiro g) {
        double bonusPorGol = 120; // bônus por gol
        return getSalarioBase() + (g.getGolsMarcados() * bonusPorGol);
    }

}
