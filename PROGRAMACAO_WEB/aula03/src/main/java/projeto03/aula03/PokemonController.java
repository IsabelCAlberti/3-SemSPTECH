package projeto03.aula03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RestController
//@RequestMapping("/pokemons")
public class PokemonController {
    private List<Pokemon> pokemons = new ArrayList<>();

    @GetMapping //consultando
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    /*Uma API REST utiliza as anotações @ResponseBody e @RequestBody para indicar ao Spring
    que um recurso não será enviado ou recebido por meio de uma página da Web.
    Se os dados do seu recurso fossem enviados a partir dos campos de uma página Web (thymeleaf, por exemplo),
    você não poderia utilizar a anotação @RequestBody no parâmetro do seu método na classe Controller.
    Mas como uma API REST não utiliza conceito de páginas Web, usa-se estas anotações para o envio ou recebimento dos recursos.
    Para ficar mais claro, utilize o programa Postman. Através dele você poderá ver a diferença.
    Você envia e recebe os dados (em formato JSON) sem a necessidade de uma página Web.
    Pega JSON e transforma no objeto*/
    @PostMapping //criando
    public String criarPokemon(@RequestBody Pokemon novoPokemon) {
        pokemons.add(novoPokemon);
        return "Pokemon cadastrado com sucesso";
    }

    @GetMapping("/{indice}")
    public Pokemon get(@PathVariable int indice) {
        return pokemons.get(indice);
    }

    @DeleteMapping("/{indice}")
    public Pokemon delete(@PathVariable int indice) {
        return pokemons.remove(indice);
    }

    @PutMapping("/{indice}")
    public String put(@PathVariable int indice,
                      @RequestBody Pokemon pokemon) {
        pokemons.set(indice, pokemon);
        return "Pokemon alterado com sucesso";
    }
}


