public class Teste {
    public static void main(String[] args) {
        String nome01 = "Isabel";
        double nota01 = 8.5;
        int ra = 123456;

        String nome02 = "João";
        double nota02 = 7.8;
        int ra02 = 654321;

        System.out.printf("%-7S %-10S %8S\n", "ra", "nome", "nota");
        System.out.printf("%07d %-10s %8.2f\n", ra, nome01, nota01);
        System.out.printf("%07d %-10s %8.2f\n", ra02, nome02, nota02);
    }
}
