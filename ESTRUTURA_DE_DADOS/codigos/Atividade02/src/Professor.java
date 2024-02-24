public class Professor implements Bonus {
    // não deve coordenar
    private String nome;
    private int qtdAulasSemana;
    private Double valorHoraAula;

    public Professor(String nome, int qtdAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(int qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double valorBonus() {
        //quantidade de aulas por semana * valor da hora aula * 4.5 * 0.15
        Double valorDoBonus = ((getQtdAulasSemana()*getValorHoraAula())*4.5)*0.15;
        return valorDoBonus;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", qtdAulasSemana=" + qtdAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }
}
