package nivel4.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(int celsius) {
        double resultadoConversao = (celsius * 1.8) + 32;
        System.out.println("A temperatura é F°" + resultadoConversao);
    }

    @Override
    public void fahrenheitParaCelsius(int fahrenheit) {
        double resultadoConversao = (fahrenheit - 32) / 1.8;
        System.out.println("A temperatura é C°" + resultadoConversao);
    }
}
