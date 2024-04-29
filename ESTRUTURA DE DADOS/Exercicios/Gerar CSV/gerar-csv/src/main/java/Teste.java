public class Teste {
    public static void main(String[] args) {
        ListaObj<Pet> listaPet = new ListaObj<>(5);

        listaPet.adiciona( new Pet(1, "Chubaca", "Grande", 12.0));
        listaPet.adiciona(new Pet(2, "Flor", "Pequeno", 8.0));
        listaPet.adiciona(new Pet(3, "Sabrina", "Médio", 20.0));
        listaPet.adiciona(new Pet(4, "Lulu", "Pequeno", 5.0));

        //System.out.println("\nLista de Pets:");
        //listaPet.exibe();

        System.out.println("Gravando Arquivos");
        GerenciadorArquivoCsv.gravaArquivoCsv(listaPet,"ArquivoPets");

        GerenciadorArquivoCsv.leArquivoCsv1("Arquivo Pets.csv");
        GerenciadorArquivoCsv.leArquivoCsv("ArquivoPets");
    }
}
