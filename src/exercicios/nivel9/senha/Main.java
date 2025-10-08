package nivel9.senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        try {
            Senha senha1 = new Senha(senha);
            System.out.println("Senha valida");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }

    }
}
