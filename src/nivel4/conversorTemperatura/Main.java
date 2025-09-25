package nivel4.conversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(24);
        conversorTemperatura.fahrenheitParaCelsius(68);
    }
}
