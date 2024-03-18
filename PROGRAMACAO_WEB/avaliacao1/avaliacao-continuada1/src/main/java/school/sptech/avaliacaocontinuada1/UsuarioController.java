package school.sptech.avaliacaocontinuada1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();


    @PostMapping
    public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario) {
        if (usuario.getEmail() == null || usuario.getEmail().length() < 10 || !usuario.getEmail().contains("@")) {
            return ResponseEntity.badRequest().body("E-mail inválido.");
        }
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return ResponseEntity.badRequest().body("E-mail já cadastrado.");
            }
        }
       usuario.setId(usuarios.size() + 1); // pego o tamanho da minha lista de usuários que é 0 e somo 1
        usuarios.add(usuario);
        return ResponseEntity.status(201).body(usuario.getEmail());
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        if (usuarios.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario.getId() == id) {
                return ResponseEntity.status(200).body(usuario);
            }
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setNome(usuarioAtualizado.getNome());
                usuario.setEmail(usuarioAtualizado.getEmail());
                usuario.setSenha(usuarioAtualizado.getSenha());
                usuario.setDtaNascimento(usuarioAtualizado.getDtaNascimento());
                return ResponseEntity.status(200).body(usuario);
            }
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletarUsuario(@PathVariable int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                return ResponseEntity.status(200).body(usuario);
            }
        }
        return ResponseEntity.status(404).build();
    }

}


