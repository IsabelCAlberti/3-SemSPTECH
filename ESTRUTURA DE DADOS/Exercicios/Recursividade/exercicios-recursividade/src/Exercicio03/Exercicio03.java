package Exercicio03;
//3. Devolve a soma dos elementos pares de um vetor de inteiros. Ex: No vetor do exemplo anterior, a soma dos pares é 2.
public class Exercicio03 {
    public static int somaPares(int vetor[], int tam) {
        if (tam == 0) {
            return 0;
        } else {
            if (vetor[tam - 1] % 2 == 0) {
                return vetor[tam - 1] + somaPares(vetor, tam - 1);
            } else {
                return somaPares(vetor, tam - 1);
            }
        }
    }
}
