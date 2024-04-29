package banco;

import java.util.ArrayList;
import java.util.List;

public class TestBanco {
    public static void main(String[] args) {

        //crie uma lista de conta bancaria e para conta faço a validação do try cath
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("João", 5000.0));
        contas.add(new ContaBancaria("Maria", 1000.0));
        contas.add(new ContaBancaria("José", 500.0));
        contas.add(new ContaBancaria("Ana", 300.0));
        contas.add(new ContaBancaria("Carlos", 200.0));

        try {
            for (ContaBancaria conta : contas) {
                conta.sacar(2000.0);
            }
        } catch (SaldoInvalidoException e) {
            System.out.println("Erro ao sacar: " + e.getMessage() + "\n Nome do titular: " + e.nomeUsuario);
        }

    }
}
