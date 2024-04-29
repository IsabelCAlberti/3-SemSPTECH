public abstract class Contrato {
    protected String nome;
    protected int codigo;
    protected Double valor;

    public Contrato( int codigo, String nome, Double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getReceita() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", valor=" + valor +
                '}';
    }
}
