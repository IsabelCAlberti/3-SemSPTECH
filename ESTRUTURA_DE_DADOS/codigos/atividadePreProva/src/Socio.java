public class Socio implements iSustentabilidade{
protected String nome;
protected Double proLabore;

    public Socio(String nome, Double proLabore) {
        this.nome = nome;
        this.proLabore = proLabore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getProLabore() {
        return proLabore;
    }

    public void setProLabore(Double proLabore) {
        this.proLabore = proLabore;
    }
    public double getContribuicaoSustentabilidade(){
        return proLabore*0.24;
    }
    @Override
    public String toString() {
        return "Socio{" +
                "nome='" + nome + '\'' +
                ", proLabore=" + proLabore +
                '}';
    }

}
