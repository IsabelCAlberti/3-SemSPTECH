package exemploException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {

        int resultado;
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite um número 01: ");
            int num = leitor.nextInt();

            System.out.println("Digite um número 01: ");
            int num01 = leitor.nextInt();

            resultado = (num / num01);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não foi possível dividir " + e.getMessage());
        } catch (InputMismatchException i){
            System.out.println("Erro: digite apenas números ");
        }
        finally {
            System.out.println("Fim da tentaiva de divisão.");
        }
    }
}
