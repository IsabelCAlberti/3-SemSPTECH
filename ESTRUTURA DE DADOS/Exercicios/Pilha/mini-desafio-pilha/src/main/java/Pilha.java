import java.util.Arrays;

public class Pilha {
    private int topo;
    private int[] pilha;

    public Pilha(int tamanho) {
        pilha = new int[tamanho];
        this.topo = -1;
    }

    public int getTopo() {
        return topo;
    }
    public int[] getPilha() {
        return pilha;
    }

    //boolean isEmpty() - Devolve true caso a pilha esteja vazia
    public boolean isEmpty(){
        return topo == -1;
    }

    //boolean isFull() – Devolve true caso a pilha esteja cheia
    public boolean isFull(){
        return topo == pilha.length - 1;
    }

    //void push (int info) Se a pilha não está cheia, então incrementa o topo e atribui info para pilha[topo] •
    public void push( int info) {
        if (topo != pilha.length - 1) {
            pilha[++topo] = info;
        }
    }

    //int pop() - Se a pilha não está vazia,
    //então devolve elemento de pilha[topo] e decrementa topo,
    //senão retorna –1
    public int pop() {
        if (topo != -1) {
            int aux = pilha[topo];
            topo--;
            return aux;
        }
        return -1;
    }

    //int peek() - se pilha não está vazia,
    //então devolve elemento de pilha[topo], senão devolve –1
    public int peek() {
        if (topo != -1) {
            return pilha[topo];
        }
        return -1;
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
    public void ehPalindromo(){
        //Cria uma pilha auxiliar
        Pilha pilhaAux = new Pilha(pilha.length);
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

    //Conversão de decimal para binário.
    // Implemente o método converteParaBinario, que recebe um número inteiro em decimal
    // e exibe o seu valor em binário. (0 e 1)
    // O método é void.
    // Utilize uma pilha para converter um número de decimal para binário.

    public void converteParaBinario(int numero){
        Pilha pilhaAux = new Pilha(pilha.length);

        //Converte o número decimal para binário
        while (numero > 0) {
            //Empilha o resto da divisão por 2 porque resto é 0 ou 1.
            pilhaAux.push(numero % 2);

            pilhaAux.exibe();
            numero = numero / 2;
        }
        System.out.println("\nNúmero em binário: ");
        //Desempilha e exibe o número em binário
        while (!pilhaAux.isEmpty()) {
            System.out.print(pilhaAux.pop());
        }
    }




}
