import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

    public class Main {
        public static void main(String[] args) throws InterruptedException {
            Scanner scanner = new Scanner(System.in);

            // Criando jogadores
            Atacante atacante = new Atacante(" ", 29);
            Goleiro goleiro = new Goleiro(" ", 35);


            Tecnico tecnico = new Tecnico("Tite", 10, 5000);
            List<String> jogadores = tecnico.getJogadores();
            System.out.println("Jogadores: " + jogadores);
            tecnico.definirEstrategia();
            tecnico.fazerSubstituicao();


            String batedorPenalti = "";

            for (int i = 1; i <= 5; i++) {
                atacante.exibirOpcoesJogadores();
                int escolha = atacante.obterEscolhaJogador(scanner, jogadores.size());
                batedorPenalti = jogadores.get(escolha - 1); // Obtém o nome do jogador escolhido
                System.out.println(goleiro.defesa());
                sleep(1000);
            }

            System.out.println("Total de Gols: " + goleiro.getGolsMarcados());
            System.out.println("Total de Defesas: " + goleiro.getDefesasFeitas());
            System.out.println("Total de Chutes para Fora: " + goleiro.getChutesFora());

            // Exibindo o salário dos jogadores e do técnico
            System.out.println("Salário do Atacante: " + atacante.calcularSalario());
            System.out.println("Salário do Goleiro: " + goleiro.calcularSalario());
            System.out.println("Salário do Técnico: " + tecnico.calcularSalario());

            scanner.close();
        }
    }
}
