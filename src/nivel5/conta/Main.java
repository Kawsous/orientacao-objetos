package nivel5.conta;

import nivel3.Conta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(100,3500);
        ContaBancaria conta2 = new ContaBancaria(101,8750);
        ContaBancaria conta3 = new ContaBancaria(102,4300);

        contasBancarias.add(conta1);
        contasBancarias.add(conta2);
        contasBancarias.add(conta3);

        ContaBancaria contaMaiorSaldo = contasBancarias.get(0);
        for (ContaBancaria conta : contasBancarias) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo\nNúmero: " + contaMaiorSaldo.getNumeroConta()
        + "\nSaldo: " + contaMaiorSaldo.getSaldo());

    }
}
