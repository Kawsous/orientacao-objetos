package nivel6.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(37);
        numeros.add(19);
        numeros.add(41);
        numeros.add(32);
        numeros.add(10);

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
