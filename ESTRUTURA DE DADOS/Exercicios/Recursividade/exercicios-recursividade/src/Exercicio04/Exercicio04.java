package Exercicio04;

public class Exercicio04 {
 
    public static int contarImpares(int[] vetor, int n) {
        if (n == 0) {
            return 0;
        }
        if (vetor[n - 1] % 2 != 0) {
            return 1 + contarImpares(vetor, n - 1);
        }
        return contarImpares(vetor, n - 1);
    }
}
