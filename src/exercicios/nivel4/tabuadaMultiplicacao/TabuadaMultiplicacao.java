package nivel4.tabuadaMultiplicacao;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void tabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            int resultado = i * numero;
            System.out.println(numero + "x" + i + " = " + resultado);
        }
    }
}
