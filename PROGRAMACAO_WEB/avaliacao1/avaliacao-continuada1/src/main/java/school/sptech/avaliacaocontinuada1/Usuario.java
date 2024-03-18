package school.sptech.avaliacaocontinuada1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Usuario {
    @NotNull
    private int id;

   @NotBlank
   private String nome;
    @NotBlank
    @Size(min = 10)
    private String email;
    @NotBlank
    private String senha;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dtaNascimento;

    public Usuario(int id, String nome, String email, String senha, LocalDate dtaNascimento) {
        this.id = id;
        this.nome = nome;
       this.email = email;
        this.senha = senha;
        this.dtaNascimento = dtaNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDtaNascimento() {
        return dtaNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDtaNascimento(LocalDate dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }
}