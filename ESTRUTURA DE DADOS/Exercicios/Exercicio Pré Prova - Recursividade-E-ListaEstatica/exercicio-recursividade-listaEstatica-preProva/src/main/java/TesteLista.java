public class TesteLista {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(7);

        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        // Testar o método adicionaNoInicio
        System.out.println("\nAdicionando no início");
        lista.adicionaNoInicio(5);

        // Testar o método exibe
        System.out.println("\nExibindo a lista");
        lista.exibe();

        // Teste do método adicionaNoInicioRecursivo
        lista.adicionaNoInicioRecursivo(40);
        lista.adicionaNoInicioRecursivo(15);
        System.out.println("\nLista exibida de forma recursiva:");
        lista.exibeRecursivo();

        // Teste do método removePeloIndiceRecursivo
        lista.removePeloIndiceRecursivo(1); // Remover o elemento de índice 1 (valor 10)
        System.out.println("\nExibindo depois do RemovePeloIndiceRecursivo");
        lista.exibe();

        // Teste do método contaOcorrenciasRecursivo
        System.out.println("\nOcorrências do elemento 20: " + lista.contaOcorrenciasRecursivo(20)); // Deve ser 1


        // Testar o método buscaRecursivo
        int indice = lista.buscaRecursivo(20); // Substitua 5 pelo valor que você está procurando
        if (indice != -1) {
            System.out.println("\nValor encontrado no índice " + indice);
        } else {
            System.out.println("\nValor não encontrado");
        }

        // Testar o método contaOcorrencias
        int ocorrencias30 = lista.contaOcorrenciasRecursivo(30); // Substitua 5 pelo valor que você está procurando
        System.out.println("\nO valor ocorre " + ocorrencias30 + " vezes na lista");

        // Testar o método removePeloIndiceRecursivo
        boolean removido = lista.removePeloIndiceRecursivo(2); // Substitua 5 pelo índice que você deseja remover
        if (removido) {
            System.out.println("\nValor removido com sucesso");
            lista.exibe();
        } else {
            System.out.println("\nÍndice inválido");
        }

        boolean removidoErrado = lista.removePeloIndiceRecursivo(5); // Tenta remover um índice inválido
        System.out.println("\nElemento removido: " + removidoErrado); // Deve ser false

        //Testar método adicionaNoInicioRecursivo
        lista.adicionaNoInicioRecursivo(40);
        lista.adicionaNoInicioRecursivo(60);

        System.out.println("\nExibindo a Lista depois de todas alterações");
        lista.exibe();

        System.out.println("\nExibindo recursivo a lista depois de todas as alterações");
        lista.exibeRecursivo();







    }
}
