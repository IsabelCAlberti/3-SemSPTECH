package projeto03.aula03;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonComStatusController {
    private List<Pokemon> pokemons = new ArrayList<>();

    @GetMapping //consultando
    public ResponseEntity<List<Pokemon>> getPokemons() {
        if(pokemons.isEmpty()) {
            // criado resposta HTTP com status 204 e sem corpo (build)
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(pokemons);
    }
    // responseentity retorna algo ou void
    @PostMapping //criando
    public ResponseEntity<Pokemon> criarPokemon(@RequestBody Pokemon novoPokemon) {
            pokemons.add(novoPokemon);
        return ResponseEntity.status(201).body(novoPokemon);
    }

    @GetMapping("/{indice}")
    public ResponseEntity<Pokemon> get(@PathVariable  @Validated int indice) {
        if (indice >= 0 && indice < pokemons.size()) {
            return ResponseEntity.status(200).body(pokemons.get(indice));
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{indice}")
    public ResponseEntity<Pokemon> delete(@PathVariable int indice) {
        if (indice >= 0 && indice < pokemons.size()) {
            pokemons.remove(indice);
            // é comum no delete o 204 voltar sem corpo
            return ResponseEntity.status(204).build();
        }
        //Gera um JSON com esta mensagem (essa é a vantagem)
        //throw new ResponseStatusException(HttpStatusCode.valueOf(404));
        throw new ResponseStatusException(HttpStatusCode.valueOf(404), "Deu ruim");
    }
    @PutMapping("/{indice}")
    public ResponseEntity<String> put(@PathVariable int indice, @RequestBody Pokemon pokemon) {
        if (indice >= 0 && indice < pokemons.size()) {
            pokemons.set(indice, pokemon);
            return ResponseEntity.status(200).body("Pokemon alterado com sucesso");
        }
        throw new ResponseStatusException(HttpStatusCode.valueOf(404), "Deu Bad");
    }
}


