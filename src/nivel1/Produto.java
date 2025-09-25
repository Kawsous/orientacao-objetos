package nivel1;

public class Produto {
    private String nome;
    private double preco;

    public void aplicaDesconto(int desconto) {
        preco = preco * (1 - desconto / 100.0);
        System.out.printf("nivel1.Produto: %s\nDesconto: R$%d\nnivel1.Produto com desconto: R$%.2f",
                nome, desconto, preco);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
