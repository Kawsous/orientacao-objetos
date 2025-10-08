package nivel5.forma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;

        Circulo circulo = new Circulo();
        circulo.raio = 3;

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(quadrado);
        listaDeFormas.add(circulo);

        for (Forma forma : listaDeFormas) {
            System.out.printf("Área: %.2f\n", forma.calcularArea());
        }
    }
}
