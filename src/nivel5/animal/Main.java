package nivel5.animal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Girafa");
        Animal animal2 = new Animal("Pinguim");

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(animal1);
        animais.add(animal2);

        //1. crio um Cachorro mas sua referencia esta em Animal
        //2. "só posso usar o kit ferramentas de Animal"
        Animal animal = new Cachorro("Toto");
        //3. estou perguntando se animal é um Cachorro, no caso sim
        if (animal instanceof Cachorro) {
            //4. estou fazendo cachorro ser do tipo Cachorro
            Cachorro cachorro = (Cachorro) animal;
            cachorro.latir();
        } else {
            System.out.println("O objeto n é um Cachorro");
        }

        for (Animal a : animais) {
            System.out.println(a);
        }
    }
}
