package sptech.projeto02;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.concurrent.ThreadLocalRandom;

public class TimeFutebol {

    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;

    @JsonIgnore // esta anotação indica que o atributo, mesmo tendo getter, não será serializado no JSON
    private Double patrimonio = ThreadLocalRandom.current()
                                .nextDouble(100, 100_000);

    public TimeFutebol(String nome, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    /*
Aqui criamos um...
Campo Virtual
Campo Calculado
Atributo Virtual
Atributo Calculado
     */
    public int getPontos() {
        // vitória dá 3 pts, empate dá 1pt e derrota, nada
        return vitorias*3 + empates;
    }

    public Double getPatrimonio() {
        return patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
}
