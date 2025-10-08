package nivel6.livros;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = sc.next() + sc.nextLine();

        System.out.println("Digite o seu limite de livros emprestados: ");
        int limiteLivro = sc.nextInt();

        Usuario usuario = new Usuario(nomeUsuario, limiteLivro);

        int sair = 1;


        while (sair != 0) {
            System.out.println("Digite o nome do livro emprestado: ");
            String nomeLivro = sc.next() + sc.nextLine();

            System.out.println("Qual a quantidade de páginas? ");
            int numeroPaginas = sc.nextInt();

            Livro livro = new Livro(nomeLivro, numeroPaginas);

            boolean livroEmprestado = usuario.pegaLivro(livro);

            if (livroEmprestado) {
                System.out.println(nomeLivro + " emprestado com sucesso!");
                System.out.println("Você possui " + usuario.getLimiteLivro() + " limites.");

                if (usuario.getLimiteLivro() == 0) {
                    break;
                }

                System.out.println("Deseja fazer empréstimo novamente?" +
                        "[1] Sim / [0] Não");
                sair = sc.nextInt();
            } else {
                System.out.println("Você não possui mais limites disponíveis!");
                break;
            }
        }
        System.out.println("Livros emprestados para " + usuario.getNomeUsuario().toUpperCase());

        Collections.sort(usuario.getLivroEmprestado());

        for (Livro l : usuario.getLivroEmprestado()) {
            System.out.println("Nome: " + l.getNomeLivro() + "\nQuantidade de" +
                    " páginas: " + l.getPaginasLivro());
        }
    }
}