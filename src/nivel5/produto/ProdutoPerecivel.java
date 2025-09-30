package nivel5.produto;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;

    public int getDataValidade() {
        return dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco) {
        super(nome, preco);
    }
}
