package nivel6.compras;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu limte: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao1 = new CartaoCredito(limite);

        int escolha = 1;

        do {
            System.out.println("Digite o nome da compra: ");
            String nome = sc.nextLine() + sc.next();

            System.out.println("Digite o valor da compra: ");
            double preco = sc.nextDouble();

            Compra compra1 = new Compra(preco, nome);

            boolean compraRealizada = cartao1.lancaCompra(compra1);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Deseja continuar comprando?\n[1] Sim / [" +
                        "0] Não");
                escolha = sc.nextInt();
            } else {
                System.out.println("Sem saldo suficiente!");
                escolha = 0;
            }

        } while (escolha != 0);

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS");

        for (Compra c : cartao1.getCompras()) {
            System.out.println("\nNome: " + c.getNome() + "\nPreço: " + c.getPreco());
        }

        System.out.println("\n***********************");

        System.out.println("Saldo disponível: " + cartao1.getSaldo());
    }
}
