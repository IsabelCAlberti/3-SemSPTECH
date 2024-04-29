package Exercicio01;

public class Exercicio01 {

    public int somaComRecursiva(int n){
        if(n>=0){
            System.out.println(n);
            return n + somaComRecursiva(n-1);
        }
        return 0;
    }

}
