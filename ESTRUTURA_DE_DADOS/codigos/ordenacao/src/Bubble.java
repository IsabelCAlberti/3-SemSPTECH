import java.util.Arrays;

public class Bubble {
    public static void exibirVetorDeInteiro(int[] vetor) {
        Arrays.stream(vetor).forEach(item -> System.out.println(item));
    }

    public static void bubbleSort(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 1; j < vetor.length - i; j++) {
                if (vetor[j-1] > vetor[j]) {
                    int aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] vetor = {4, 7, 5, 2, 8, 1, 6, 3};
        bubbleSort(vetor);
        System.out.println("Bubble Sort");
exibirVetorDeInteiro(vetor);

    }
}