package nivel4.animal;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("auauauau");
    }

    public void marcarTerritorio() {
        System.out.println("mijando");
    }
}
