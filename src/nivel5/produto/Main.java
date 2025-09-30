package nivel5.produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Monitor", 449.99);
        produto1.setQuantidade(1);
        produtos.add(produto1);

        Produto produto2 = new Produto("Computador", 2349.99);
        produto2.setQuantidade(1);
        produtos.add(produto2);

        Produto produto3 = new Produto("Energético", 20);
        produto3.setQuantidade(2);
        produtos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.printf("Média dos preços: %.2f\n", precoMedio);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println(produtos);
        System.out.println("Produto 1: " + produtos.get(0));
    }
}
