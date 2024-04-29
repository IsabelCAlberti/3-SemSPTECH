package exemploException;

public class DivisaoThrows {
    public static void main(String[] args) {
        try {
            System.out.println(dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
