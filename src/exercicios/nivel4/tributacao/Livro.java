package nivel4.tributacao;

public class Livro extends Produto implements Tributavel{
    @Override
    public double precoFinal() {
        return getPreco() * 0.9;
    }
}
