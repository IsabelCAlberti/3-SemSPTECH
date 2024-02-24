package sptech.questao02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroiController {
    private List<Heroi> herois = new ArrayList<>();

    @GetMapping("/herois")
    public List<Heroi> getHerois() {
        return herois;
    }

    @PostMapping("/herois/novo/{nome}/{descricao}/{forca}")
    public Heroi adicionarHeroi(@PathVariable String nome, @PathVariable String descricao, @PathVariable int forca) {
        String classe;
        if (forca <= 500) {
            classe = "C";
        } else if (forca <= 8000) {
            classe = "B";
        } else if (forca <= 20000) {
            classe = "A";
        } else {
            classe = "S";
        }
        Heroi heroi = new Heroi(nome, descricao, forca, classe);
        herois.add(heroi);
        return heroi;
    }

    @GetMapping("/herois/classe/{classe}")
    public List<Heroi> getHeroisByClasse(@PathVariable String classe) {
        return herois.stream()
                .filter(heroi -> heroi.getClasse().equals(classe))
                .collect(Collectors.toList());
    }
}
