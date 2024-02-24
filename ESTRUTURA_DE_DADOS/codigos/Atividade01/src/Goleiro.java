public class Goleiro extends Jogador{
    private int defesasFeitas;
    private int golsMarcados;
    private int chutesFora;
    public Goleiro(String nome, int idade, double salarioBase) {
        super(nome, idade, salarioBase);
    }

    public int getDefesasFeitas() {
        return defesasFeitas;
    }

    public void setDefesasFeitas(int defesasFeitas) {
        this.defesasFeitas = defesasFeitas;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getChutesFora() {
        return chutesFora;
    }

    public void setChutesFora(int chutesFora) {
        this.chutesFora = chutesFora;
    }

    public String defesa() {
        System.out.println("O goleiro está pronto para o penalty");
        double deuDefesa = Math.random() * 5;
        if (deuDefesa <= 1) {
            defesasFeitas++;
            return "Defendeu !!!!!!";
        } else if (deuDefesa > 1 && deuDefesa <= 4) {
            golsMarcados++;
            return "Gollllllllllllllllllll!!!";
        } else {
            chutesFora++;
            return "Pra fora!!!!!!!";
        }
    }

    @Override
    public double calcularSalario() {
        double bonusPorDefesa = 180; // bônus por defesa
        return getSalarioBase() + (defesasFeitas * bonusPorDefesa);
    }
}
