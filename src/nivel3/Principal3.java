package nivel3;

public class Principal3 {
    public static void main(String[] args) {
        //Carro
//        Carro carro1 = new Carro();
//        carro1.defineMarca("Corsa");
//        carro1.definePrecos(30000, 35000, 29000);
//        carro1.exibeFicha();

        // Animal
//        Cachorro cachorro = new Cachorro();
//        cachorro.emiteSom();
//        cachorro.roeOsso();
//
//        Gato gato = new Gato();
//        gato.emiteSom();
//        gato.arranhaMoveis();

        // Conta
        ContaCorrente conta1 = new ContaCorrente();
        conta1.deposita(1000);
        System.out.println(conta1.cobraTarifaMensal());

    }
}