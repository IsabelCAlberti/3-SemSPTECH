public class FuncionarioHorista extends Funcionario implements Calculavel{
    protected Double valorHora;
    protected Double qtdHoras;

    public FuncionarioHorista(Integer codigo, String nome, Double salario, Double valorHora, Double qtdHoras) {
        super(codigo, nome, salario);
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Double getQtdHoras() {
        return qtdHoras;
    }
    @Override
    public Double getGanho() {
        return valorHora * qtdHoras;
    }

    @Override
    public Double getValorBonus() {
        return getGanho() * 0.10;
    }
}
