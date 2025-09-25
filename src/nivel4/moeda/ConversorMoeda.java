package nivel4.moeda;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double dolar) {
        double cotacaoDolar = 4.80;
        double valorReal = dolar * cotacaoDolar;
        System.out.println("Valor em reais: " + valorReal);
    }
}
