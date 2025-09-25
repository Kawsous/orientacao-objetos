package nivel4.vendavel;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setValor(10);
        System.out.println(produto.precoTotal(2));

        Servico servico = new Servico();
        servico.setValor(40);
        System.out.println(servico.precoTotal(1));
    }
}
