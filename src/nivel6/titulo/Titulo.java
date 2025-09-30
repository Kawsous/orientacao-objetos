package nivel6.titulo;

public class Titulo implements Comparable<Titulo>{
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    //editando o contrato da interface para q eu possa comparar os nomes em
    //ordem alfabetica
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
