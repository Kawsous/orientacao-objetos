package nivel1;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificaIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Vc é maior de idade :(");
        } else {
            System.out.println("Vc é menor de idade :)");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
