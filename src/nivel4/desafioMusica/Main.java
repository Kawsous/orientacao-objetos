package nivel4.desafioMusica;

import nivel4.desafioMusica.models.Avaliacao;
import nivel4.desafioMusica.models.Musica;
import nivel4.desafioMusica.models.Podcast;

public class Main {
    public static void main(String[] args) {

        //instanciando objeto
        Musica musica1 = new Musica();
        Avaliacao avaliacao = new Avaliacao();

        musica1.setTitulo("Mein");
        musica1.setArtista("Deftones");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            musica1.curte();
        }

        musica1.exibirFicha();
        avaliacao.inclui(musica1);

        Podcast podcast =  new Podcast();
        podcast.setTitulo("VIDA ADULTA");
        podcast.setApresentador("Nathan");

        for (int i = 0; i < 500; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i <= 90; i++) {
            podcast.curte();
        }

        podcast.exibirFicha();
        avaliacao.inclui(podcast);
    }
}
