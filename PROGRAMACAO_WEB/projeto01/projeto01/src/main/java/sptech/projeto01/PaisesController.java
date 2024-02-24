package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisesController {

    private int acessos = 0;

    private List<String> paises = new ArrayList<>(List.of("Chile", "México", "Peru", "Venezuela", "Cuba"));

    @GetMapping("/acessos")
    public int acessos() {
        acessos++;
        return acessos;
    }

    @GetMapping("/{posicao}")
    public String posicaoPaises(@PathVariable int posicao) {
        return paises.get(posicao);
      }

    @GetMapping("/novo/{nome}")
    public String novoPais(@PathVariable String nome) {
        paises.add(nome);
        return "País %s inserido com sucesso".formatted(nome);
    }
}

