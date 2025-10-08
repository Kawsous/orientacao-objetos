package nivel4.tributacao;

public class Main {
    public static void main(String[] args) {
        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPreco(3100);
        System.out.println("O valor final do produto digital: " + produtoDigital.precoFinal());

        Livro livro = new Livro();
        livro.setPreco(20);
        System.out.println("O valor final do livro: " + livro.precoFinal());
    }
}
