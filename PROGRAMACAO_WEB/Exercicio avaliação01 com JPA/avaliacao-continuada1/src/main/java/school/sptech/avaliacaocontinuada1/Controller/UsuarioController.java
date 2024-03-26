package school.sptech.avaliacaocontinuada1.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.avaliacaocontinuada1.Domain.Usuario;
import school.sptech.avaliacaocontinuada1.Repository.UsuarioRepository;

import java.util.List;
import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        var lista = repository.findAll();
        return lista.isEmpty() ? status(204).body(lista)
                : status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<String> cadastrarUsuario(@RequestBody @Valid Usuario novoUsuario) {
        if (novoUsuario.getEmail() == null || novoUsuario.getEmail().length() < 10 || !novoUsuario.getEmail().contains("@")) {
            return ResponseEntity.badRequest().body("E-mail inválido.");
        }
        for (Usuario u : repository.findAll()) {
            if (u.getEmail().equals(novoUsuario.getEmail())) {
                return ResponseEntity.badRequest().body("E-mail já cadastrado.");
            }
        }
        repository.save(novoUsuario);
        return ResponseEntity.status(201).body("Usuário cadastrado com sucesso.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable int id) {
        return ResponseEntity.of(repository.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable int id, @RequestBody @Valid Usuario usuarioAtualizado) {
        if (usuarioAtualizado.getEmail() == null || usuarioAtualizado.getEmail().length() < 10 || !usuarioAtualizado.getEmail().contains("@")) {
            return ResponseEntity.status(400).build();
        }
        usuarioAtualizado.setId(id);
        repository.save(usuarioAtualizado);
        return ResponseEntity.status(200).body(usuarioAtualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarUsuario(@PathVariable int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.status(200).body("Usuário deletado com sucesso.");
        }
        return ResponseEntity.status(404).build();
    }
}

