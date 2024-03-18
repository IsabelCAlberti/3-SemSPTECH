import java.util.ArrayList;
import java.util.List;

public class ControleSustentabilidade {

    private List<iSustentabilidade> objetosContribuicaoLista = new ArrayList<>();

    public void adicionarObjetoNaLista(iSustentabilidade objetoContribuicao){
        objetosContribuicaoLista.add(objetoContribuicao);
    }

   public Double totalContribuicoes(){
        Double totalContribuicoes = 0.0;
        for (iSustentabilidade objetoContribuicao : objetosContribuicaoLista) {
            totalContribuicoes += objetoContribuicao.getContribuicaoSustentabilidade();
        }
       return totalContribuicoes;
   };
    public void exibirObjetosComContribuicao(){
        for (iSustentabilidade objeto : objetosContribuicaoLista) {
            System.out.println(objeto);
        }
    }



    //o método que calcula e retorna o total de contribuições,
    //e também o método que exibe todos os objetos que têm contribuição.
}
