package nivel4.tributacao;

public class ProdutoDigital extends Produto implements Tributavel, Teste {
    @Override
    public double precoFinal() {
        return getPreco() * 1.5;
    }

    @Override
    public void seila() {

    }
}
