package nivel6.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Kawan");
        Titulo titulo2 = new Titulo("Davi");
        Titulo titulo3 = new Titulo("Marcelo");
        Titulo titulo4 = new Titulo("Isac");
        Titulo titulo5 = new Titulo("Kawan");

        List<Titulo> nomes = new ArrayList<>();
        nomes.add(titulo1);
        nomes.add(titulo2);
        nomes.add(titulo3);
        nomes.add(titulo4);
        nomes.add(titulo5);

        Collections.sort(nomes);

        for (Titulo titulo : nomes) {
            System.out.println(titulo.nome);
        }

        //criando uma lista utilizando a interface List e instanciando como
        //ArrayList e LinkedList

        List<Integer> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add(10);
        listaPolimorfica.add(100);

        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();

        listaPolimorfica.add(20);
        listaPolimorfica.add(200);
        System.out.println(listaPolimorfica);
    }
}
