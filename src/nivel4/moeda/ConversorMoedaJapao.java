package nivel4.moeda;

public class ConversorMoedaJapao implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double dolar) {
        double conversao = 2.5;
        double valorJapao = conversao * dolar;
        System.out.println("O valor do Yiene: " + valorJapao);
    }
}
