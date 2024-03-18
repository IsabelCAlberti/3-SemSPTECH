public class FuncionarioHoraExtra extends Funcionario implements Calculavel{

protected Double qtdHorasExtras;
protected Double valorHoraExtra;

    public FuncionarioHoraExtra(Integer codigo, String nome, Double salario, Double qtdHorasExtras, Double valorHoraExtra) {
        super(codigo, nome, salario);
        this.qtdHorasExtras = qtdHorasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Double getQtdHorasExtras() {
        return qtdHorasExtras;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }
    @Override
    public Double getGanho() {
        return salario + (qtdHorasExtras * valorHoraExtra);
    }
    @Override
    public Double getValorBonus() {
        return getGanho() * 0.15;
    }


}
