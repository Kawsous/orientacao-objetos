package nivel8.pessoa;

public record Pessoa(String nome, int idade, String cidade) {
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
