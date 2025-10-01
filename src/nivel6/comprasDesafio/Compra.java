package nivel6.compras;

public class Compra {
    private String nome;
    private double preco;

    public Compra(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nCompra: " +
                "\nNome: " + nome +
                "\nPreço: " + preco;
    }
}
