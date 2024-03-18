public class Main {
    public static void main(String[] args) {
        FuncionarioHoraExtra funcionarioHoraExtra = new FuncionarioHoraExtra(1, "João", 3.000, 120.0, 20.5);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista(2, "Maria", 4.000, 300.0, 100.0);
        Acionista acionista = new Acionista("Carlos", 100, 50.0);

        ControleBonus controleBonus = new ControleBonus();
        controleBonus.adicionarFuncionario(funcionarioHoraExtra);
        controleBonus.adicionarFuncionarioHorista(funcionarioHorista);
        controleBonus.adicionarAcionista(acionista);

        System.out.println(funcionarioHorista);
        System.out.println(funcionarioHoraExtra);
        System.out.println(acionista);

        System.out.println("Total gasto em bônus: R$ " + controleBonus.calcularTotalBonus());
        controleBonus.exibirTodosBonus();
    }

}
