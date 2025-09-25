package nivel1;

public class Principal1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.exibeDobro(10.5));

        Musica musica = new Musica();

        musica.pegaAvaliacao(10);
        musica.pegaAvaliacao(8);
        musica.pegaAvaliacao(8.5);

        musica.exibirFichaTecnica("Mein", "Deftones", 2022);
        double media = musica.pegaMediaAvaliacao();
        double somaAvaliacao = musica.somaAvaliacao;
        System.out.printf("Média: %.2f\nSoma das Avaliações: %.2f", media, somaAvaliacao);

        Carro carro = new Carro();
        carro.marca = "EcoSport";
        carro.cor = "Preto";

        carro.exibirFichaTecnica();
        double velocidadeMedia = carro.velocidadeMedia(20, 2);
        System.out.println("A velocidade média do carro foi "+ velocidadeMedia + "KM/H");

    }
}