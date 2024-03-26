package Exercicio04;

import static Exercicio03.Exercicio03.somaPares;

public class Teste04 {
    public static void main(String[] args) {
        int[] vetor = {7, 3, 5, 2};

        System.out.println("Quantidade de elementos ímpares:");
         System.out.println(Exercicio04.contarImpares(vetor, vetor.length));
    }
}
