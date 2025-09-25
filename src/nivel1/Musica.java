package nivel1;

public class Musica {
    String nome;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(String nome, String artista, int anoLancamento) {
        System.out.println("Música: " + nome +
                "\nBanda: " + artista + "" +
                "\nAno de Lançamento: " + anoLancamento);
    }

    void pegaAvaliacao(double nota) {
        somaAvaliacao += nota;
        numAvaliacao++;
    }

    double pegaMediaAvaliacao() {
        return somaAvaliacao / numAvaliacao;
    }
}