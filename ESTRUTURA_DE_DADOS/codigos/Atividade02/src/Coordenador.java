public class Coordenador  implements Bonus{
    //não deve dar aula
    private String nome;
    private int qtdHorasCooSemana;
    private double valorHoraCoo;

    public Coordenador(String nome, int qtdHorasCooSemana, double valorHoraCoo) {
        this.nome = nome;
        this.qtdHorasCooSemana = qtdHorasCooSemana;
        this.valorHoraCoo = valorHoraCoo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdHorasCooSemana() {
        return qtdHorasCooSemana;
    }

    public void setQtdHorasCooSemana(int qtdHorasCooSemana) {
        this.qtdHorasCooSemana = qtdHorasCooSemana;
    }

    public double getValorHoraCoo() {
        return valorHoraCoo;
    }

    public void setValorHoraCoo(double valorHoraCoo) {
        this.valorHoraCoo = valorHoraCoo;
    }

    @Override
    public double valorBonus() {
        //quantidade de horas de coordenação por semana * valor da hora de coordenação * 4.5 * 0.2
        Double bonusTotal = ((qtdHorasCooSemana*valorHoraCoo)*4.5)*0.2;
        return bonusTotal;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", qtdHorasCooSemana=" + qtdHorasCooSemana +
                ", valorHoraCoo=" + valorHoraCoo +
                '}';
    }
}
