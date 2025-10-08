package nivel6.livros;

public class Livro implements Comparable<Livro>{
    private String nomeLivro;
    private int paginasLivro;

    public Livro(String nomeLivro, int paginasLivro) {
        this.nomeLivro = nomeLivro;
        this.paginasLivro = paginasLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public int getPaginasLivro() {
        return paginasLivro;
    }

    @Override
    public String toString() {
        return "\nLivro:" +
                "\nNome: " + nomeLivro;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return Integer.valueOf(this.paginasLivro).compareTo(outroLivro.paginasLivro);
    }
}
