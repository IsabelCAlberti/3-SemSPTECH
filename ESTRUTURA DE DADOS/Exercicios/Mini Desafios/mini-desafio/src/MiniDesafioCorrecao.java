import java.util.Arrays;
import java.util.Scanner;

public class MiniDesafioCorrecao {
    public static void main(String[] args) {
        String[] nomesT1 = new String[10];
        String[] nomesT2 = new String[10];

        int quantidadeT1 = 0;
        int quantidadeT2 = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < nomesT2.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.print("Digite a turma (T1 ou T2): ");
            String turma = leitor.nextLine();

            Boolean turmaValida = turma.equalsIgnoreCase("T1") || turma.equalsIgnoreCase("T2");

            while( !turmaValida) {
                System.out.println("Turma inválida. Digite novamente.");
                turma = leitor.nextLine();
                turmaValida = turma.equalsIgnoreCase("T1") || turma.equalsIgnoreCase("T2");
            }

            if (turma.equalsIgnoreCase("T1")) {
                nomesT1[quantidadeT1] = nome;
                quantidadeT1++;
            } else if(turma.equalsIgnoreCase("T2"))  {
                nomesT2[quantidadeT2++] = nome;
            }
        }

        System.out.println("Exibindo vetor da turma T1");
        System.out.println(Arrays.toString(nomesT1));

        System.out.println("Exibindo vetor da turma T2");
        System.out.println(Arrays.toString(nomesT2));
    }


}
