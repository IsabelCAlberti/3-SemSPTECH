
public class ListaEstatica {

    private int[] vetor;
    private int nroElem; // ocupação do vetor, ou seja, quanto do vetor ja foi preenchido

       public ListaEstatica(int tam) {
        vetor = new int[tam];
        this.nroElem = 0;
    }

    public void adiciona(int elemento) {
        if (nroElem < vetor.length) {
            vetor[nroElem++] = elemento;
        } else {
            throw new IllegalStateException();
        }
    }
    public int busca(int elementoProcurado) {
        //percorro somente a quantidade de elementos que estão no vetor e não o vetor inteiro
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                System.out.println("\nElemento encontrado no índice: " + i);
                return i; // retornando o indice, se fosse o return vetor[i] seria o elemento
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido");
            return false;
        }
        //Começa no indice que quero remover e vai até o numero total de elementos -1
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1]; // o elemento que está na posição i+1 vai para a posição i
        }
        nroElem--;
        System.out.println("\nElemento removido");
        return true;
    }
    public boolean removeElemento(int elemento) {
        return removePeloIndice(busca(elemento)); //metodo chamando outro metodo - composição
    }
    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }
    public boolean substituir(int elemento, int elementoNovo) {
        int indiceSubstituir = busca(elemento);
        if (indiceSubstituir == -1) {
            return false;
        } else {
            vetor[indiceSubstituir] = elementoNovo;
            return true;
        }
    }
    public int contaOcorrencias(int elementoRecebido) {
        int contador = 0;

        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoRecebido) {
                contador++;
            }
        }
        return contador;
    }
   public boolean adicionaNoInicio(int elemento) {
        if (nroElem == vetor.length) {
            System.out.println("Lista cheia");
            return false;
        }
        for (int i = nroElem; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = elemento;
        nroElem++;
        return true;
    }

    //Crie na classe ListaEstatica o método público exibeRecursivo, que não recebe nenhum argumento.
    // Esse método printa “Lista vazia” se a lista estiver vazia, senão chama o método privado exibeRecursivo.
    public void exibeRecursivo() {
        if (nroElem == 0) {
            System.out.println("Lista vazia");
        } else {
            exibeRecursivo(0);
        }
    }

    // Crie na classe ListaEstatica o método privado exibeRecursivo que recebe o índice inicial do vetor da lista estática.
    // Esse método percorre de forma recursiva “a parte válida da lista” (dos índices zero a nroElem-1), exibindo seus valores na console. Teste o método, chamando-o na main.
    private void exibeRecursivo(int indice) {
        if (indice < nroElem) {
            System.out.println(vetor[indice]);
            exibeRecursivo(indice + 1);
        }
    }

    // Crie na classe ListaEstatica o método privado buscaRecursivo, de tipo int,
    // que recebe como argumentos o valor a ser buscado na lista
    // e o índice inicial do vetor da lista estática.
    // Esse método percorre de forma recursiva “a parte válida da lista” (dos índices zero a nroElem-1),
    // procurando o valor a ser buscado.
    // Se encontrar retorna o seu índice.
    // Se percorrer toda a lista e não o encontrar, retorna -1.
    private int buscaRecursivo(int valorBuscado, int indiceListaEstatica) {
        // Verifica se chegou ao final da lista
        if (indiceListaEstatica == nroElem) {
            return -1; // Retorna -1 se o elemento não foi encontrado
        }
        // Verifica se o elemento atual é o que está sendo buscado
        if (vetor[indiceListaEstatica] == valorBuscado) {
            return indiceListaEstatica; // Retorna o índice se o elemento for encontrado
        }
        // Chama recursivamente para o próximo elemento na lista
        return buscaRecursivo(valorBuscado, indiceListaEstatica + 1);
    }

    //Crie na classe ListaEstatica o método público buscaRecursivo, de tipo int,
    // que recebe como argumento o valor a ser buscado.
    // Esse método chama o método privado buscaRecursivo.
    public int buscaRecursivo(int valorBuscado) {
        return buscaRecursivo(valorBuscado, 0);
    }

    // Crie na classe ListaEstatica o método privado contaOcorrenciasRecursivo, de tipo int,
    // que recebe como argumentos o valor a ser buscado na lista e o índice inicial do vetor da lista estática.
    // Esse método percorre de forma recursiva “a parte válida da lista” (dos índices zero a nroElem-1), “contando” a quantidade de ocorrências do valor a ser buscado.
    // Retorna a quantidade de ocorrências do valor a ser buscado.
    private int contaOcorrenciasRecursivo(int valorBuscado, int indiceListaEstatica) {
        // Verifica se chegou ao final da lista
        if (indiceListaEstatica == nroElem) {
            return 0; // Retorna 0 se o elemento não foi encontrado
        }
        // Verifica se o elemento atual é o que está sendo buscado
        if (vetor[indiceListaEstatica] == valorBuscado) {
            return 1 + contaOcorrenciasRecursivo(valorBuscado, indiceListaEstatica + 1); // Retorna 1 + a quantidade de ocorrências do elemento encontrado
        }
        // Chama recursivamente para o próximo elemento na lista
        return contaOcorrenciasRecursivo(valorBuscado, indiceListaEstatica + 1);
    }

    //Crie na classe ListaEstatica o método público contaOcorrenciasRecursivo, de tipo int,
    // que recebe como argumento o valor a ser procurado.
    // Esse método chama o método privado contaOcorrenciasRecursivo.
    public int contaOcorrenciasRecursivo(int valorBuscado) {
        return contaOcorrenciasRecursivo(valorBuscado, 0);
    }

    //Crie na classe ListaEstatica o método público removePeloIndiceRecursivo, de tipo Boolean,
    // que recebe como argumento o índice do valor a ser removido.
    // Esse método verifica se o índice é inválido e se for, retorna false.
    // Senão, chama o método privado deslocaParaEsquerdaRecursivo, decrementa o nroElem e retorna true.
    public boolean removePeloIndiceRecursivo(int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido");
            return false;
        }
        deslocaParaEsquerdaRecursivo(indice);
        nroElem--;
        return true;
    }

    // Crie na classe ListaEstatica o método privado deslocaParaEsquerdaRecursivo, de tipo void,
    // que recebe como argumento o índice do valor a ser removido.
    // Esse método percorre de forma recursiva a partir do índice recebido como argumento, enquanto o índice for menor do que nroElem-1,
    // fazendo a posição atual do vetor (índice) receber o valor da posição seguinte do vetor.
    private void deslocaParaEsquerdaRecursivo(int indice) {
        if (indice < nroElem - 1) {
            vetor[indice] = vetor[indice + 1];
            deslocaParaEsquerdaRecursivo(indice + 1);
        }
    }


    //Crie na classe ListaEstatica o método público adicionaNoInicioRecursivo, de tipo void,
    // que recebe como argumento o valor a ser adicionado na lista.
    //Esse método verifica se a lista está cheia e se estiver, printa uma mensagem e retorna.
    // Se não estiver cheia, chama o método privado deslocaParaDireitaRecursivo, incrementa o nroElem e retorna.
    public void adicionaNoInicioRecursivo(int valor) {
        if (nroElem == vetor.length) {
            System.out.println("Lista cheia");
            return; // utilizado para encerrar a execução do método caso a condição de lista cheia seja atendida. evitar que o método continue sua execução e tente adicionar o elemento mesmo quando a lista não tem mais espaço, o que poderia causar um erro ou comportamento indesejado.
        }
        deslocaParaDireitaRecursivo(nroElem);
        vetor[0] = valor;
        nroElem++;
        exibe();
    }

    // Crie na classe ListaEstatica o método privado deslocaParaDireitaRecursivo, de tipo void,
    // que recebe como argumento o índice para percorrer a lista, a partir do final da lista.
    // Esse método percorre de forma recursiva a partir do índice recebido como argumento,
    // enquanto o índice for maior do que zero, fazendo a posição atual do vetor receber o valor da posição anterior do vetor.
    private void deslocaParaDireitaRecursivo(int indice) {
        if (indice > 0) {
            vetor[indice] = vetor[indice - 1];
            deslocaParaDireitaRecursivo(indice - 1);
        }
    }
    /* private void deslocaParaDireitaRecursivo(int indice) {
        if (indice >= 0) {
            lista[indice + 1] = lista[indice];
            deslocaParaDireitaRecursivo(indice - 1);
        }
    }*/

    public int getNroElem() {
        return nroElem;
    }
    public int[] getVetor() {
        return vetor;
    }
}
