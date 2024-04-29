import java.util.Scanner;

public class MiniDesafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] vetorT1 = {"Ana Figueira", "João Paulo", "Pedro Augusto", "Maria Cristina", "Lucas José", "Larissa Andrade", "Mariana", "Felipe", "Carla Júlia", "Paulo"};
        String[] vetorT2 = {"Mariana Camargo", "Lucas Lima", "Carla Faria", "João Pedro", "Ana Lúcia", "Paulo Gustavo", "Pedro", "Felipe", "Larissa", "Evelyn"};

        int i;
        int j;
        String turma = "";

        for (i = 0; i <= vetorT1.length; i++) {
            System.out.println("Aluno(a) " + vetorT1[i] + " está em qual turma? Digite T1 ou T2:");
            turma = scanner.nextLine();
        }

        for (j = 0; j <= vetorT2.length; j++) {
            System.out.println("Aluno(a) " + vetorT2[j] + " está em qual turma? Digite T1 ou T2:");
            turma = scanner.nextLine();
        }

        switch (turma) {
            case "T1":
                System.out.println("Aluno(a) " + vetorT1[i] + " está na turma T1");
                vetorT1[i] = turma;
                System.out.println(vetorT1[i] + turma);
                break;
            case "T2":
                System.out.println("Aluno(a) " + vetorT2[j] + " está na turma T2");
                break;
        }
    }
}
