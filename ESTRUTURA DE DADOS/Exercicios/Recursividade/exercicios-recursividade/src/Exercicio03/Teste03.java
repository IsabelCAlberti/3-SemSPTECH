package Exercicio03;

import static Exercicio03.Exercicio03.somaPares;

public class Teste03 {
    public static void main(String[] args) {
        Exercicio03 e = new Exercicio03();

        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tam = vetor.length;
        System.out.println("Soma dos pares: " + somaPares(vetor, tam));
    }
}
