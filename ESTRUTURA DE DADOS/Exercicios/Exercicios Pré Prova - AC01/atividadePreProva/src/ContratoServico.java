public class ContratoServico extends Contrato implements iSustentabilidade {
    private Integer quantidadeContratosFechados;

    public ContratoServico(int codigo, String nome, Double valor, Integer quantidadeContratosFechados) {
        super(codigo, nome, valor);
        this.quantidadeContratosFechados = quantidadeContratosFechados;
    }

    @Override
    public double getReceita() {
        return valor * quantidadeContratosFechados;
    }

    public double getContribuicaoSustentabilidade() {
        double contribuicao = getReceita() * 0.18;
        return contribuicao * quantidadeContratosFechados;
    }
}