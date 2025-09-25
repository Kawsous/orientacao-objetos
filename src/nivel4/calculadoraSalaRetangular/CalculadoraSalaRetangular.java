package nivel4.calculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double resultadoArea = altura * largura;
        System.out.println("A área é igual a " + resultadoArea);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double resultadoPerimetro = (altura + largura) * 2;
        System.out.println("O perímetro é igual a " + resultadoPerimetro);
    }
}
