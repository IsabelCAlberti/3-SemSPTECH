package Exercicio02;

public class Exercicio02 {

    public static void exibirVetor(int[] vetor, int i) {
        if (i >= 0) {
            System.out.println(vetor[i]);
            exibirVetor(vetor, i - 1);
        }
    }

    public static int somaVetor(int[] vetor, int indice) {
        if (indice >= 0) {
            return somaVetor(vetor, indice - 1) + vetor[indice];
        }
        return 0;
    }
}
