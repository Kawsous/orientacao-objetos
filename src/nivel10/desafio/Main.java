package nivel10.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um CEP válido: ");
            String cep = sc.nextLine();

            ConsultaCep consultaCep = new ConsultaCep();

            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

            GeradorJson geradorJson = new GeradorJson();
            geradorJson.salvaJson(novoEndereco);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Programa finalizado");
        }
    }
}