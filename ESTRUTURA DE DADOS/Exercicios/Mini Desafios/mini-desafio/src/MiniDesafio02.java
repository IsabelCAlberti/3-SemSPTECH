import java.util.Scanner;

public class MiniDesafio02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] nomesT1 = new String[10];
            String[] nomesT2 = new String[10];
            int contadorT1 = 0;
            int contadorT2 = 0;

            for (int i = 0; i < nomesT1.length; i++) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a turma (T1 ou T2): ");
                String turma = scanner.nextLine();

                if (turma.equalsIgnoreCase("T1")) {
                    if (contadorT1 < 10) {
                        nomesT1[contadorT1] = nome;
                        System.out.println("Aluno " + nome + " adicionado à turma T1 na posição " + contadorT1);
                        contadorT1++;
                    } else {
                        System.out.println("Turma T1 já está completa!");
                        i--; // Repete a entrada para a mesma posição
                    }
                } else if (turma.equalsIgnoreCase("T2")) {
                    if (contadorT2 < 10) {
                        nomesT2[contadorT2] = nome;
                        System.out.println("Aluno " + nome + " adicionado à turma T2 na posição " + contadorT2);
                        contadorT2++;
                    } else {
                        System.out.println("Turma T2 já está completa!");
                        i--;
                    }
                } else {
                    System.out.println("Turma inválida. Digite T1 ou T2.");
                    i--;
                }
            }

            System.out.println("\nQuantidade de alunos na turma T1: " + contadorT1);
            System.out.println("Alunos da turma T1:");

            for (int i = 0; i < contadorT1; i++) {
                System.out.println("Posição " + i + ": " + nomesT1[i]);
            }

            System.out.println("\nQuantidade de alunos na turma T2: " + contadorT2);
            System.out.println("Alunos da turma T2:");

            for (int i = 0; i < contadorT2; i++) {
                System.out.println("Posição " + i + ": " + nomesT2[i]);
            }
        }
    }
