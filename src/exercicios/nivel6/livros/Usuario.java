package nivel6.livros;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private int limiteLivro;
    private List<Livro> livroEmprestado;

    public Usuario(String nomeUsuario, int limiteLivro) {
        this.nomeUsuario = nomeUsuario;
        this.limiteLivro = limiteLivro;
        this.livroEmprestado = new ArrayList<>();
    }

    public boolean pegaLivro(Livro livro) {
        if (limiteLivro > 0) {
            limiteLivro -= 1;
            livroEmprestado.add(livro);
            return true;
        } else {
            return false;
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getLimiteLivro() {
        return limiteLivro;
    }

    public List<Livro> getLivroEmprestado() {
        return livroEmprestado;
    }
}
