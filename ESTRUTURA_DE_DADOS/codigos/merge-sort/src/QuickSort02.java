public class QuickSort02 {

    public static void quickSort(int[] vetor, int indInicio, int indFim) {
        int i, j, pivot;
        i = indInicio;
        j = indFim;
        pivot = vetor[(indInicio + indFim) / 2];

        while(i<=j) {
            while (i < indFim && vetor[i] < pivot) {
                i = i + 1;
            }
            while (j > indInicio && vetor[j] > pivot) {
                j = j - 1;
            }
            if (i <= j) {
                int vAux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = vAux;
                i = i + 1;
                j = j - 1;
            }
        }

        if (indInicio < j) {
            quickSort(vetor, indInicio, j);
        }
        if (i < indFim) {
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