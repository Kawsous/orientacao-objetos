package nivel9.divisao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 10;

        Scanner sc = new Scanner(System.in);
        try {
            double resultado = n2 / n1;
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }

    }
}
