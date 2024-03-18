public class Acionista implements Calculavel{
    protected String nome;
    protected Integer qtdAcoes;
    protected Double valorAcao;

    public Acionista(String nome, Integer qtdAcoes, Double valorAcao) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.valorAcao = valorAcao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(Integer qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public Double getValorAcao() {
        return valorAcao;
    }

    public void setValorAcao(Double valorAcao) {
        this.valorAcao = valorAcao;
    }

    @Override
    public Double getGanho() {
        return null;
    }
    @Override
    public Double getValorBonus(){
      return qtdAcoes*valorAcao*0.2;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", qtdAcoes=" + qtdAcoes +
                ", valorAcao=" + valorAcao +
                '}';
    }
}
