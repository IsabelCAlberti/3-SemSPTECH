public class ContratoProduto extends Contrato implements iSustentabilidade  {
    private Integer quantidadeLicencasVendidas;

    public ContratoProduto(int codigo, String nome, Double valor, Integer quantidadeLicencasVendidas) {
        super(codigo, nome, valor);
        this.quantidadeLicencasVendidas = quantidadeLicencasVendidas;
    }

    public double getReceita() {
        return valor * quantidadeLicencasVendidas;
    }
    public double getContribuicaoSustentabilidade(){
        var contribuicao = getReceita() * 0.13;
        return contribuicao*quantidadeLicencasVendidas;
    }

}
