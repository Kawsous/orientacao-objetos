package nivel2;

public class Principal2 {
    public static void main(String[] args) {
        /*

        // Conta Bancaria
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Kawan";
        conta1.deposito(-1000);
        System.out.println(conta1.titular);
        System.out.println(conta1.getSaldo());
         */

        /*
        //Idade da nivel1.Pessoa
        nivel1.IdadePessoa idadePessoa = new nivel1.IdadePessoa();
        idadePessoa.verificaIdade(19);
         */
/*
        //Aplicar Desconto
        nivel1.Produto produto1 = new nivel1.Produto();
        produto1.setNome("Garrafa");
        produto1.setPreco(100);
        produto1.aplicaDesconto(10);
 */

        //Média dos Alunos
        Aluno al1 = new Aluno("Kawan", 8, 9, 5);
        System.out.println("Nome: " + al1.getNome());
        System.out.printf("Nota 1: %.2f\n" +
                "Nota 2: %.2f\n" +
                "Nota 3: %.2f\n" +
                "Média: %.2f\n" +
                "Resultado: %s", al1.getNota1(), al1.getNota2(), al1.getNota3(), al1.calculaMedia(), al1.isAprovado());

    }
}
