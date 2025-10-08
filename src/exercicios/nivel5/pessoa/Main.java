package nivel5.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Kawan");
        pessoa1.setIdade(19);
        listaDePessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Vitor");
        pessoa2.setIdade(28);
        listaDePessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Frozen");
        pessoa3.setIdade(37);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println(listaDePessoas);

    }
}
