package nivel9.senha;

public class Senha {
    String senha;

    public Senha(String senha) {
        this.senha = senha;

        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Senha precisa ter no minimo 8 caracteres");
        }
    }
}
