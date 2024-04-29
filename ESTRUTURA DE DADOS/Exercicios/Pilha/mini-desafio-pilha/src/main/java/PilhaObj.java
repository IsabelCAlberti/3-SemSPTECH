public class PilhaObj<T> {

    //deverá armazenar elementos de tipo genérico <T>
    private int topo;
    private T[] pilha;

    public PilhaObj(int tamanho) {
        pilha = (T[]) new Object[tamanho];
        this.topo = -1;
    }

    public int getTopo() {
        return topo;
    }

    public T[] getPilha() {
        return pilha;
    }

    public void push(T info) {
        if (topo != pilha.length - 1) {
            pilha[++topo] = info;
        }
    }

    //int pop() - Se a pilha não está vazia,
    //então devolve elemento de pilha[topo] e decrementa topo,
    //senão retorna –1
    public T pop() {
        if (topo != -1) {
            T aux = pilha[topo];
            topo--;
            return aux;
        }
        return null;
    }

    //int peek() - se pilha não está vazia,
    //então devolve elemento de pilha[topo], senão devolve –1
    public T peek() {
        if (topo != -1) {
            return pilha[topo];
        }
        return null;
    }

    //void exibe() - Se a pilha está vazia, exibe "Pilha vazia",
    // senão exibe os elementos da pilha
    public void exibe() {
        if (topo == -1) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(pilha[i]);
            }
        }
    }

    //recebe um vetor de inteiros e retorna true se a sequência de inteiros no vetor for palíndroma
    // e retorna false, caso contrário.
    public void ehPalindromo() {
        //Cria uma pilha auxiliar
        PilhaObj pilhaAux = new PilhaObj(pilha.length);
        //Copia os elementos da pilha original para a pilha auxiliar
        for (int i = 0; i <= topo; i++) {
            pilhaAux.push(pilha[i]);
        }
        //Verifica se é palíndromo
        boolean palindromo = true;

        //Compara os elementos da pilha original com a pilha auxiliar
        for (int i = 0; i <= topo; i++) {
            //Se os elementos forem diferentes, não é palíndromo
            if (pilha[i] != pilhaAux.pop()) {
                palindromo = false;
                break;
            }
        }
        //Exibe o resultado
        if (palindromo) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }

    /*Implementar um programa que utilize uma pilha para ler uma frase e exibi-la invertida. Neste caso, o elemento da pilha deve ser do tipo Character (use a PilhaObj).
    Ex: a frase “A pilha do gato” deve sair “otag od ahlip A”
    Dica Java: para trabalhar com cada caractere da String, pode-se obter cada caractere da String, utilizando o método charAt(índice)
    Ex: for (int i=0; i < frase.length( ); i++) {
    System.out.println (frase.charAt(i));
    }*/
    public void inverteFrase(String frase) {
        PilhaObj<Character> pilhaAux = new PilhaObj<>(frase.length());
        for (int i = 0; i < frase.length(); i++) {
            pilhaAux.push(frase.charAt(i));
        }
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(pilhaAux.pop());
        }
    }
}
