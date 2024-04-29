public class Main {
    public static void main(String[] args) {

    ControleSustentabilidade controle = new ControleSustentabilidade();

    ContratoProduto produto1 = new ContratoProduto(5, "contrato01",100.0, 10);
    ContratoServico servico1 = new ContratoServico(3,"servico01", 200.0,5);
    Socio socio1 = new Socio("Jose",10000.0);

    controle.adicionarObjetoNaLista(produto1);
    controle.adicionarObjetoNaLista(servico1);
    controle.adicionarObjetoNaLista(socio1);

        double totalContribuicoes = controle.totalContribuicoes();

        System.out.println(produto1);
        System.out.println(servico1);
        System.out.println(socio1);

    System.out.println("Total de contribuições: " + totalContribuicoes);

    controle.exibirObjetosComContribuicao();

    }
}

