package nivel4.desafioMusica.models;

public class Avaliacao {
    public void inclui(Audio audio) {
        if (audio.getTotalCurtidas() >= 100) {
            System.out.println("Em alta!");
        } else if (audio.getTotalCurtidas() >= 50) {
            System.out.println("Em fluxo normal de views.");
        } else {
            System.out.println("Queda de visualizações...");
        }
    }
}
