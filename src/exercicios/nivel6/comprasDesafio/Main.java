package nivel6.comprasDesafio;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu limte: ");
        double limite = sc.nextDouble();

        //instanciando cartao
        CartaoCredito cartao1 = new CartaoCredito(limite);

        int escolha = 1;

        do {
            System.out.println("Digite o nome da compra: ");
            String nome = sc.nextLine() + sc.next();

            System.out.println("Digite o valor da compra: ");
            double preco = sc.nextDouble();

            Compra compra1 = new Compra(preco, nome);

            //atribuindo o metodo de validacao a uma variavel
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

        //ordenando a lista em ordem decrescente
        cartao1.getCompras().sort(Collections.reverseOrder());

        for (Compra c : cartao1.getCompras()) {
            System.out.println("\nNome: " + c.getNome() + "\nPreço: " + c.getPreco());
        }

        System.out.println("\n***********************");

        System.out.println("Saldo disponível: " + cartao1.getSaldo());
    }
}
