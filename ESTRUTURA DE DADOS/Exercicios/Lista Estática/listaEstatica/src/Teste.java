public class Teste {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        System.out.println("Adicionando elementos...");
        lista.adicionar(50);
        lista.adicionar(20);
        lista.adicionar(18);
        lista.adicionar(92);

        lista.exibir();
        lista.buscarPorIndice(20);

        lista.removePeloIndice(3);
        System.out.println("Lista após remoção do índice");
        lista.exibir();

        lista.adicionar(54);
        System.out.println("\nLista após adição de um novo número");
        lista.exibir();

       // lista.exibirLength();

       // lista.removeElemento(20);
       // System.out.println("Lista após remoção do elemento");
       // lista.exibir();
    }
}
