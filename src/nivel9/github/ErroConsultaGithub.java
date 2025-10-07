package nivel9.github;

public class ErroConsultaGithub extends RuntimeException {
    private String mensagem;

    public ErroConsultaGithub(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
