public class QuickSort02 {

    public static void quickSort(int[] vetor, int indInicio, int indFim) {
        int i, j, pivot;
        i = indInicio;
        j = indFim;
        pivot = vetor[(indInicio + indFim) / 2];

        while(i<=j) { // enquanto inicio não ultrapassa o fim
            // Enquanto o valor na posição i for menor que o pivot, incrementa i
            while (i < indFim && vetor[i] < pivot) {
                i = i + 1;
            }
            // Enquanto o valor na posição j for maior que o pivot, decrementa j
            while (j > indInicio && vetor[j] > pivot) {
                j = j - 1;
            }
            // Se i não ultrapassou j, troca os valores de i e j
            if (i <= j) {
                int vAux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = vAux;
                i = i + 1;
                j = j - 1;
            }
        }
        // Se j não ultrapassou o inicio, particiona e divide em partes menores
        if (indInicio < j) { // Se tiver elementos à esquerda
            quickSort(vetor, indInicio, j);
        }
        // Se i não ultrapassou o fim, particiona e divide em partes menores
        if (i < indFim) { // Se tiver elementos à direita do pivot
            quickSort(vetor, i, indFim);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {10, 7, 8, 9, 1, 5};
        quickSort(vetor, 0, vetor.length - 1);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}