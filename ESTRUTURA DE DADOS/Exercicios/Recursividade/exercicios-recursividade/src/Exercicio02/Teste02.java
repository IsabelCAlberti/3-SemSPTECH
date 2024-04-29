package Exercicio02;

import static Exercicio02.Exercicio02.exibirVetor;

public class Teste02 {
    public static void main(String[] args) {

        Exercicio02 exercicio02 = new Exercicio02();
        int[] vetorInteiros = {7, 3, 5, 2};

        System.out.println("Elementos do vetor em ordem reversa:");
        exibirVetor(vetorInteiros, vetorInteiros.length - 1);

        System.out.println("A soma dos elementos do vetor é: " + exercicio02.somaVetor(vetorInteiros, vetorInteiros.length - 1));
        }
    }
