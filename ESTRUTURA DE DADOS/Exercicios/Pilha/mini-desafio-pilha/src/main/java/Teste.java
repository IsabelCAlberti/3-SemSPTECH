public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);


        System.out.println("Pilha vazia? " + pilha.isEmpty());
        System.out.println("Pilha cheia? " + pilha.isFull());

        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(10);
        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(20);
        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(30);
        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(30);
        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(20);
        System.out.println("\nAdicionando elementos na pilha");
        pilha.push(10);

        pilha.exibe();

        System.out.println("\nPilha vazia? " + pilha.isEmpty());
        System.out.println("Pilha cheia? " + pilha.isFull());

        System.out.println("\nPop na pilha");
        pilha.pop();
        pilha.exibe();

        pilha.push(73);

        System.out.println("\nPeek na pilha");
        pilha.peek();
        pilha.exibe();

        System.out.println('\n' + "Exibindo elementos da pilha");
        pilha.exibe();

        System.out.println("Verificando se é uma Pilha de Palindromos");
        pilha.ehPalindromo();

        System.out.println("\nComvertendo numero em binário usando pilha");
        pilha.converteParaBinario(20);


    /*teste sua classe PilhaObj:
            - crie um objeto da classe PilhaObj para armazenar Strings
- empilhe algumas Strings
- exiba a pilha
- desempilhe as Strings e exiba-as conforme desempilhar*/

        PilhaObj<String> pilhaObj = new PilhaObj<>(10);

        pilhaObj.push("TEXTO");
        pilhaObj.push("PARAGRAFO");
        pilhaObj.push("LINHA");

        System.out.println("\nExibindo elementos da pilha Obj");
        pilhaObj.exibe();

        System.out.println("\nDesempilhando elementos da pilha");
        System.out.println(pilhaObj.pop());

    }
}