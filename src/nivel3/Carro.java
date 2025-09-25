package nivel3;

public class Carro {
    private String marca;
    private double preco1;
    private double preco2;
    private double preco3;

    public void defineMarca(String marca) {
        this.marca = marca;
    }

    public void definePrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void exibeFicha() {
        System.out.printf("Marca: %s" +
                "\nPreço 2023: R$%.2f" +
                "\nPreço 2024: R$%.2f" +
                "\nPreço 2025: R$%.2f" +
                "\n------------------" +
                "\nMenor preço: R$%.2f" +
                "\nMaior preço: R$%.2f", marca, preco1, preco2, preco3, menorPreco(), maiorPreco());
    }

    private double maiorPreco() {
        if (preco1 > preco2 && preco1 > preco3) {
            return  preco1;
        } else if (preco2 > preco1 && preco2 > preco3) {
            return preco2;
        } else {
            return preco3;
        }
    }

    private double menorPreco() {
        if (preco1 < preco2 && preco1 < preco3) {
            return preco1;
        } else if (preco2 < preco1 && preco2 < preco3) {
            return preco2;
        } else {
            return preco3;
        }
    }
}
