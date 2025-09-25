package nivel4.vendavel;

public class Servico implements Vendavel{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double precoTotal(int quantidade) {
        return (getValor() * 1.2) * quantidade;
    }
}
