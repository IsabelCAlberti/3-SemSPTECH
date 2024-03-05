package sptech.projeto03;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TipoPokemon {
@NotBlank
    private String codigo;
@NotBlank
private String nome;

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
