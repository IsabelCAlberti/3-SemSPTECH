public class Ordenacao {
    public static void exibirVetorDeInteiros(int[] vetor) {
        //exibe o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    //Fica buscando o menor valor e trocando de lugar
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    //não fica fazendo a troca, ele guarda em uma auxiliar e só faz a troca no final
    public static void selectionSortOtimizado(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = aux;
        }
    }

    //fica sempre comparando vizinhos, se o vizinho for maior realiza a troca
    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 1; j < vetor.length - i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
    }

    //Sempre retorna um inteiro
    //Sempre retorna a posição do elemento que estou buscando
    public static int pesquisaBinaria(int[] vetor04, int valorProcurado) {

        int indiceInferior = 0;
        int indiceSuperior = vetor04.length - 1;

        while (indiceInferior <= indiceSuperior) {

            int meio = (indiceInferior + indiceSuperior) / 2;

            if (vetor04[meio] == valorProcurado) {
                return meio; // retorna o índice e não o valor
            } else if (valorProcurado < vetor04[meio]) {
                indiceSuperior = meio - 1;
            } else {
                indiceInferior = meio + 1;
            }
        }
        return -1;
    }

public static void insertionSort(int[] vetor) {
    int j;
    int aux;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        int[] vetor = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] vetor02 = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] vetor03 = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] vetor04 = {15, 20, 25, 30, 32, 35, 40, 45, 50};
        int[] vetor05 = {15, 7, 25, 2, 35, 1, 45, 3, 8, 4, 5, 6};

        System.out.println("Selection Sort:");
        selectionSort(vetor);
        exibirVetorDeInteiros(vetor);

        System.out.println("Selection Sort Otimizado:");
        selectionSortOtimizado(vetor02);
        exibirVetorDeInteiros(vetor02);

        System.out.println("Bubble Sort Otimizado:");
        selectionSortOtimizado(vetor03);
        exibirVetorDeInteiros(vetor03);

        System.out.println("Pesquisa Binária:");
        int valorProcurado = 35;
        System.out.println("Posição do valor procurado: "
                + pesquisaBinaria(vetor04, valorProcurado));
    }

}
