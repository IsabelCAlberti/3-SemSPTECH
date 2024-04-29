package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esportes")
public class EsportesController {

    private List<String> esportes = new ArrayList<>(
            List.of("futebol", "basquete", "xadrez", "esgrima", "mma"));

    /*
@RequestParam -> indica que o Endpoint terá Request Params
ou, Parâmetros de Requisição.
OU "Query Params"
O primero sempre é precedido de "?"
Os demais, são precedidos de "&"
     */
    // esportes/consulta?pesquisa=te
    // esportes/consulta?pesquisa=xad
    @GetMapping("/consulta")
    public List<String> consultar(@RequestParam String pesquisa) {
        // solução moderna
        /*
Aqui usamos o stream (Java 8+)
         */
        return esportes.stream()
                .filter(esporte -> esporte.contains(pesquisa))
                .toList();

        // solução clássica
        /*List<String> filtro = new ArrayList<>();
        for (String esporte : esportes) {
            if (esporte.contains(pesquisa)) {
                filtro.add(esporte);
            }
        }
        return filtro;*/
    }
    /*
    // esportes/consulta-complexa?pesquisa=mma&tamanho=3
    Deve retorna a lista de todos os esportes que contenham o termo
    informado em "pesquisa" e que tenham no mínimo X caracteres
    onde X é o valor de "tamanho"
     */

    @GetMapping("/consulta-complexa")
    public List<String> consultarComplexo(
            @RequestParam String pesquisa,
            @RequestParam int tamanho) {

        return esportes.stream()
                .filter(esporte -> esporte.contains(pesquisa) && esporte.length()>=tamanho)
                .toList();
    }


}