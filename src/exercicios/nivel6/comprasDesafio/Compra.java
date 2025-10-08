package nivel6.comprasDesafio;

public class Compra implements Comparable<Compra>{
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

    //modificando o 'contrato' da interface para comparar tipos Double
    @Override
    public int compareTo(Compra outraCompras) {
        return Double.valueOf(this.preco).compareTo(outraCompras.preco);
    }
}
