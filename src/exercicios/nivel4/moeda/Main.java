package nivel4.moeda;

public class Main {
    public static void main(String[] args) {
        ConversaoFinanceira conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(10);

        ConversaoFinanceira conversorMoedaJapao = new ConversorMoedaJapao();
        conversorMoedaJapao.converterDolarParaReal(10);
    }
}
