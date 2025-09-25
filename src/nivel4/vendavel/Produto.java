package nivel4.vendavel;

public class Produto implements Vendavel{
    private double valor;

    @Override
    public double precoTotal(int quantidade) {
        return quantidade * getValor();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
