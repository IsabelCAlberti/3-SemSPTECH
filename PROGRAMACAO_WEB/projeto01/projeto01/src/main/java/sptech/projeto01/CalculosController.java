package sptech.projeto01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculos")
public class CalculosController {

    @GetMapping("/dobro/{numero}")
    public String dobro(@PathVariable Double numero) {
     return "O dobro de %s é %s".formatted(numero, numero*2);
  }

    @GetMapping("/media/{numero1}/{numero2}")
    public String dobro(@PathVariable Double numero1,
                        @PathVariable Double numero2) {
        double media =(numero1+numero2)/2;
        return "A média entre %s e %s é %.2f".formatted(numero1, numero2, media);
    }

    @GetMapping("/resultado/{nota1}/{nota2}")
    public String resultado(@PathVariable Double nota1,
                            @PathVariable Double nota2) {
        double media = (nota1 + nota2) / 2;
        return media >= 6
                ? "Parabéns, você foi Aprovado!"
                : "Tente outra vez!";

    }
}
