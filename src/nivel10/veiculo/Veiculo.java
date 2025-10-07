package nivel10.veiculo;

public class Veiculo {
    private String marca;
    private int anoLancamento;
    private String cor;

    public Veiculo(String marca, int anoLancamento, String cor) {
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", cor='" + cor + '\'' +
                '}';
    }
}
