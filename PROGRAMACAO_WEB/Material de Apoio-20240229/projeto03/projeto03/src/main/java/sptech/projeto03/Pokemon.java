package sptech.projeto03;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.br.TituloEleitoral;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pokemon {
    /*@NotBlank -> rejeita null, "" ou "    " (aspas com espaço) - melhor opção de validação para texto*/
   /* NÃO DEVEMOS USAR EM OUTROS TIPOS (BOOEAN, DOUBLE, ETC)*/
    @NotBlank
    @Size(min=3, max=10)
    private String nome;

/*@NotNull -> rejeita valor null ou campo não enviado/nãpo presente */
@NotNull
@Valid // se tivermos um objeto do tipo complexo precisamos dessa anotação  ai ele valida as anotações que tiverem dentro da classe tipoPokemon
    private TipoPokemon tipo;

@NotNull
@DecimalMin("100")
@DecimalMax("10000.0")
@Positive
private Double forca;
    private boolean solto;
    @Email
    private String email;
    @CPF
    private String cpf;

    @TituloEleitoral
    private String tituloEleitoral;

    @CNPJ
    private String cnpj;
    private LocalDateTime criacao = LocalDateTime.now();
/*@Past // só passado
@PastOrPresent // de hoje para trás
@Future // só futuro
@FutureOrPresent // presente e o futuro*/
    private LocalDate dataNascimento;
    public String getNome() {
        return nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public boolean isSolto() {
        return solto;
    }

    public LocalDateTime getCriacao() {
        return criacao;
    }
}
