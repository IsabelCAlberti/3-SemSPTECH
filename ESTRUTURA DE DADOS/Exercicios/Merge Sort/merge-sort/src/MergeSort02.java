public class MergeSort02 {

    public static void mergeSort(int parteUm, int parteDois, int[] vetor) {
        if (parteUm < parteDois-1) {
            int meio = (parteUm + parteDois) / 2;
            mergeSort(parteUm, meio, vetor);
            mergeSort(meio , parteDois, vetor);
            intercala(parteUm, meio, parteDois, vetor);
        }
    }
    public static void intercala(int indiceInicial, int meio, int indiceFinal, int[] vetor) {
        int indiceDaPrimeiraParte, indiceDaSegundaParte, indiceVetorAux;
        int[] vetorAux = new int[vetor.length];
        indiceDaPrimeiraParte = indiceInicial;
        indiceDaSegundaParte = meio;
        indiceVetorAux = 0;

        //Compara em qual metade do vetor esta o menor valor/elemento e o coloca no vetor auxiliar
        while (indiceDaPrimeiraParte < meio && indiceDaSegundaParte < indiceFinal) {
            if (vetor[indiceDaPrimeiraParte] <= vetor[indiceDaSegundaParte]) {
                vetorAux[indiceVetorAux++] = vetor[indiceDaPrimeiraParte++];
            } else {
                vetorAux[indiceVetorAux++] = vetor[indiceDaSegundaParte++];
            }
        }

        //Valida caso ainda existam elementos na primeira metade do vetor
        while (indiceDaPrimeiraParte < meio) {
            vetorAux[indiceVetorAux++] = vetor[indiceDaPrimeiraParte++];
        }

        //Valida caso ainda existam elementos na segunda metade do vetor
        while (indiceDaSegundaParte < indiceFinal) {
            vetorAux[indiceVetorAux++] = vetor[indiceDaSegundaParte++];
        }

        //Copia os elementos do vetor auxiliar para o vetor original
        for (indiceDaPrimeiraParte = indiceInicial; indiceDaPrimeiraParte < indiceFinal; indiceDaPrimeiraParte++) {
            vetor[indiceDaPrimeiraParte] = vetorAux[indiceDaPrimeiraParte - indiceInicial];
        }
    }

    public static void main(String[] args) {
        int[] vetor = {11, 13, 7, 2, 9, 1, 3, 21, 27, 32, 42, 49, 56, 58, 61, 90, 90};
        mergeSort(0, vetor.length, vetor);
        System.out.println("Vetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}