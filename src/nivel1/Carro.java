package nivel1;

public class Carro {
    String marca;
    String cor;


    void exibirFichaTecnica() {
        System.out.println("\nModelo do carro: " + marca
        + "\nCor do carro: " + cor);
    }

    double velocidadeMedia(double viagem, double tempo) {
        return viagem / tempo;
    }
}