public class main {
    public static void main(String[] args) {
        //Criar objetos dessa classe e preencher um vetor de tamanho no mínimo 8.
        Estadio[] vetorLotacao = new Estadio[8];
        Estadio estadio = new Estadio(01, "Maracanã", 78.838, "aberto", "todos", 1.05000000000);
        Estadio estadio1 = new Estadio(02, "Wembley", 90.000, "Coberto", "todos", 5.985000000);
        Estadio estadio2 = new Estadio(03, "Santiago Bernabéu", 81.044, "Coberto", "todos", 3.250000000);
        Estadio estadio3 = new Estadio(04, "Allianz Arena", 75.000, "Coberto", "todos", 2.210000000);
        Estadio estadio4 = new Estadio(05, "Giuseppe Meazza", 75.923, "Aberto", "todos", 390.000000);
        Estadio estadio5 = new Estadio(06, "Signal Iduna Park", 81.365, "Aberto", "todos", null);
        Estadio estadio6 = new Estadio(07, "Camp Nou", 99.354, "Aberto", "todos", null);

        vetorLotacao[0] = estadio;
        vetorLotacao[1] = estadio1;
        vetorLotacao[2] = estadio3;
        vetorLotacao[3] = estadio4;
        vetorLotacao[4] = estadio5;
        vetorLotacao[5] = estadio6;
        vetorLotacao[6] = null;

        //Ordenar os dados do vetor, usando como critério um atributo diferente do ID.
        //Implementar 2 algoritmos de ordenação diferentes baseado nesse critério.
        // Bubble Sort
        for (int i = 0; i < vetorLotacao.length - 1; i++) {
            for (int j = 1; j < vetorLotacao.length - i; j++) {
                if (vetorLotacao[j - 1] != null && vetorLotacao[j] != null) {
                    if (vetorLotacao[j - 1].getLotacao() > vetorLotacao[j].getLotacao()) {
                        Estadio aux = vetorLotacao[j - 1];
                        vetorLotacao[j - 1] = vetorLotacao[j];
                        vetorLotacao[j] = aux;
                    }
                }
            }
        }

        //ORDEM DECRESCENTE
        // Bubble Sort
        for (int i = 0; i < vetorLotacao.length - 1; i++) {
            for (int j = 1; j < vetorLotacao.length - i; j++) {
                if (vetorLotacao[j - 1] != null && vetorLotacao[j] != null) {
                    if (vetorLotacao[j - 1].getLotacao() > vetorLotacao[j].getLotacao()) {
                        Estadio aux = vetorLotacao[j - 1];
                        vetorLotacao[j - 1] = vetorLotacao[j];
                        vetorLotacao[j] = aux;
                    }
                }
            }
        }


        // Selection Sort
        for (int primeiro = 0; primeiro < vetorLotacao.length; primeiro++) {
            int indMaior = primeiro;
            for (int segundo = primeiro + 1; segundo < vetorLotacao.length; segundo++) {
                if (vetorLotacao[segundo] != null && vetorLotacao[indMaior] != null) {
                    if (vetorLotacao[segundo].getLotacao() > vetorLotacao[indMaior].getLotacao()) {
                        indMaior = segundo;
                    }
                }
            }
            if (vetorLotacao[indMaior] != null) {
                Estadio aux = vetorLotacao[primeiro];
                vetorLotacao[primeiro] = vetorLotacao[indMaior];
                vetorLotacao[indMaior] = aux;
            }
        }


        //ORDEM DECRESCENTE
        // Selection Sort
        for (int primeiro = 0; primeiro < vetorLotacao.length; primeiro++) {
            int indMaior = primeiro;
            for (int segundo = primeiro + 1; segundo < vetorLotacao.length; segundo++) {
                if (vetorLotacao[segundo] != null && vetorLotacao[indMaior] != null) {
                    if (vetorLotacao[segundo].getLotacao() > vetorLotacao[indMaior].getLotacao()) {
                        indMaior = segundo;
                    }
                }
            }
            if (vetorLotacao[indMaior] != null) {
                Estadio aux = vetorLotacao[primeiro];
                vetorLotacao[primeiro] = vetorLotacao[indMaior];
                vetorLotacao[indMaior] = aux;
            }
        }

        // Pesquisa Binária
        int indice = pesquisaBinaria(vetorLotacao);
        if (indice != -1) {
            System.out.println("Estádio encontrado na posição: " + indice);
        } else {
            System.out.println("Estádio não encontrado.");
        }
    }

    //Pesquisa Binária
    public static int pesquisaBinaria(Estadio[] vetorLotacao) {
        int indInf = 0;
        int indSup = vetorLotacao.length - 1;
        while (indInf <= indSup) {
            int meio = indInf + (indSup - indInf) / 2;
            if (vetorLotacao[meio].getLotacao() == 78.838) {
                return meio;
            } else if (7 < vetorLotacao[meio].getLotacao()) {
                indSup = meio - 1;
            } else {
                indInf = meio + 1;
            }
        }
        return -1;
    }
}

