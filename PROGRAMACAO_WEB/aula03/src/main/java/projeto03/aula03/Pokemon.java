package projeto03.aula03;

public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private boolean solto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public boolean isSolto() {
        return solto;
    }

    public void setSolto(boolean solto) {
        this.solto = solto;
    }
}
