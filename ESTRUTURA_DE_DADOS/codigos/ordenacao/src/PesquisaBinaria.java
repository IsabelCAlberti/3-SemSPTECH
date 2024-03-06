import java.util.Arrays;

public class PesquisaBinaria {
    public static void exibirPesquisa(int[] vetor) {
        Arrays.stream(vetor).forEach(item -> System.out.println(item));
    }
    public static int pesquisaBinaria(int[] vetor) {
        int indInf = 0;
        int indSup = vetor.length - 1;
        while (indInf <= indSup) {
            int meio = indInf + (indSup - indInf) / 2;
            if (vetor[meio] == 7) {
                return meio;
            } else if (7 < vetor[meio]) {
                indSup = meio - 1;
            } else {
                indInf = meio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9};
        System.out.println("Pesquisa Binária");
        System.out.println("O número 07 esta na posição: " + pesquisaBinaria(vetor) + " do seu Array");
    }
}

