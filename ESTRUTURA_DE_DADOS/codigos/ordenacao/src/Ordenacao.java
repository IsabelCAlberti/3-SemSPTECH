import java.util.Arrays;

public class Ordenacao {

    public static void exibirVetorDeInteiro(int[] vetor){
        Arrays.stream(vetor).forEach(item-> System.out.println(item));

        Arrays.stream(vetor).forEach(System.out::print);

        for(int num: vetor){
            System.out.print(num);}

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
   public static void selectionSort(int[] vetor) {
       for (int primeiro = 0; primeiro < vetor.length; primeiro++) {
           for (int segundo = primeiro + 1; segundo < vetor.length; segundo++) {
               if (vetor[segundo] < vetor[primeiro]) {
                   int aux = vetor[primeiro];
                   vetor[primeiro] = vetor[segundo];
                   vetor[segundo] = aux;
               }
           }
       }
   }
   public static void selectionSortOtimizado(int[] vetor02){
       for (int primeiro = 0; primeiro < vetor02.length; primeiro++) {
           int indMenor = primeiro;
           for (int segundo = primeiro + 1; segundo < vetor02.length; segundo++) {
               if (vetor02[segundo] < vetor02[indMenor]) {
                    indMenor = segundo;
               }
           }
           int aux = vetor02[primeiro];
           vetor02[primeiro] = vetor02[indMenor];
           vetor02[indMenor] = aux;
       }
   }

    public static void main(String[] args) {
        int[] vetor = {4,7,5,2,8,1,6,3};
        int[] vetor02 = {4,7,5,2,8,1,6,32,3,45,61};


        selectionSort(vetor);
        System.out.println("Selection Sort");
        exibirVetorDeInteiro(vetor);

        System.out.println("Selection Sort Otimizado");
        selectionSortOtimizado(vetor02);
        exibirVetorDeInteiro(vetor02);
    }
}

