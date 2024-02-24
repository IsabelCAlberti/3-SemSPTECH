package sptech.questao01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FrutaController {
    private List<String> frutas = new ArrayList<>();

    @GetMapping("/frutas")
    public List<String> getFrutas() {
        return frutas;
    }

    @PostMapping("/frutas/nova/{nomeFruta}")
    public String adicionarFruta(@PathVariable String nomeFruta) {
        frutas.add(nomeFruta);
        return "Fruta " + nomeFruta + " cadastrada com sucesso";
    }

    @GetMapping("/frutas/contagem")
    public int contagemFrutas() {
        return frutas.size();
    }

    @GetMapping("/frutas/consulta/{nomeFruta}")
    public String consultarFruta(@PathVariable String nomeFruta) {
        return frutas.contains(nomeFruta) ? "Fruta encontrada" : "Fruta não encontrada";
    }
}

