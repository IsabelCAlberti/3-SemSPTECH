public class ListaEstatica {
protected int[] vetor;
protected int nroElem;

    public ListaEstatica(int tamanho) {
        vetor = new int[tamanho];
        this.nroElem = 0;
    }

    public void adicionar(int elemento){
        if (nroElem < vetor.length) {
            vetor[nroElem] = elemento;
            nroElem++;
        } else {
            System.out.println("Lista cheia");
        }
    }
    public void exibir() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void exibirLength() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int buscarPorIndice(int elementoBusca){
       // Devolve o índice do vetor onde está o elemento ou -1 se não encontrou
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoBusca) {
                System.out.println("\nElemento encontrado no índice: " + i);
                return i;
            }
        }
        System.out.println("\nElemento não encontrado");
        return -1;
        }

    //Devolve true se removeu ou false se índice inválido
    public boolean removePeloIndice(int indice){
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido");
            return false;
        }
        for (int i = indice; i <= nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        System.out.println("\nElemento removido");
        return true;
    }

    // Procura o elemento a ser removido
    // Devolve true se removeu e false se não encontrou
    public boolean removeElemento(int elemento){
        int indice = buscarPorIndice(elemento);
        if (indice < 0) {
            System.out.println("Elemento não encontrado");
            return false;
        }
        System.out.println("Elemento removido");
        return removePeloIndice(indice);
    }


}

