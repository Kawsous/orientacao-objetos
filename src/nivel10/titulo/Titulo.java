package nivel10.titulo;

public class Titulo {
    private String nome;
    private String comidaFavorita;

    public Titulo(String nome, String comidaFavorita) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
    }

    public String getNome() {
        return nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                '}';
    }
}
