package nivel4.animal;

public class Principal4 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        ((Cachorro) cachorro).marcarTerritorio();

        Animal gato = new Gato();
        gato.emitirSom();

        Animal vaca = new Vaca();
        vaca.emitirSom();

        Animal pato = new Pato();
        pato.emitirSom();
    }
}
