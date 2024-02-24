public class main {
    public static void main(String[] args) {

        ControleBonus controle = new ControleBonus();
        Professor professor = new Professor("João", 10, 50.0);
        Coordenador coordenador = new Coordenador("Maria", 20, 30.0);

        controle.adicionarFuncionario(professor);
        controle.adicionarFuncionario(coordenador);

        System.out.println("Funcionários com bônus:");
        controle.exibirLista();
        System.out.println("\nTotal de bônus a ser pago: R$" + controle.calcularTotalBonus());
}
}