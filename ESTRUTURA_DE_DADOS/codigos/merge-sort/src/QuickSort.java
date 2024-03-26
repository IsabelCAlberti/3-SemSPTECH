public class QuickSort {
    public static void quickSort(int[] vetor, int low, int high) {
        if (low < high) {
            int pi = partition(vetor, low, high);
            quickSort(vetor, low, pi - 1);
            quickSort(vetor, pi + 1, high);
        }
    }

    public static int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (vetor[j] < pivot) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] vetor = {10, 7, 8, 9, 1, 5};
        quickSort(vetor, 0, vetor.length - 1);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}