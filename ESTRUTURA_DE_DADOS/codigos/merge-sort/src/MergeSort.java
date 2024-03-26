public class MergeSort {
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }
            int[] aux = new int[arr.length];
            mergeSort(arr, aux, 0, arr.length - 1);
        }

        private static void mergeSort(int[] arr, int[] aux, int baixo, int alto) {
            if (baixo < alto) {
                int meio = (baixo + alto) / 2;
                mergeSort(arr, aux, baixo, meio);
                mergeSort(arr, aux, meio + 1, alto);
                merge(arr, aux, baixo, meio, alto);
            }
        }

        private static void merge(int[] arr, int[] aux, int baixo, int meio, int alto) {
            // Copia ambas as metades para o array auxiliar
            for (int i = baixo; i <= alto; i++) {
                aux[i] = arr[i];
            }

            int auxEsq = baixo;
            int auxDir = meio + 1;
            int atual = baixo;

            // Itera sobre o array auxiliar. Compara a metade esquerda e direita, copiando de volta o menor elemento das duas metades para o array original.
            while (auxEsq <= meio && auxDir <= alto) {
                if (aux[auxEsq] <= aux[auxDir]) {
                    arr[atual] = aux[auxEsq];
                    auxEsq++;
                } else {
                    arr[atual] = aux[auxDir];
                    auxDir++;
                }
                atual++;
            }

            // Copia o restante da metade esquerda do array auxiliar de volta para o array original
            int restante = meio - auxEsq;
            for (int i = 0; i <= restante; i++) {
                arr[atual + i] = aux[auxEsq + i];
            }
        }

        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7, 2, 9, 1, 3, 21, 27, 32, 32};
            mergeSort(arr);
            System.out.println("Array ordenado:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
