package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que a classe é capaz de abrigar end-points
@RequestMapping("/frases")
public class FrasesController {
    @GetMapping("/cumprimentar")
    public String cumprimentar() {
       return "Sejam bem vindos à minha API";
    }

    @GetMapping("/boa-noite")
    public String boaNoite(){
        return "Bons Sonhos! Dorme com Deus";
    }

    @GetMapping("/populacao-mundial")
    public Long populacao(){
        return 8_000_000_000L;
    }

    @GetMapping("/palmeiras-mundial")
    public Boolean palmeirasTemMundial(){
    return false;
    }



}
