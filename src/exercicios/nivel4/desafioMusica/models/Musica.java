package nivel4.desafioMusica.models;

public class Musica extends Audio {
    private String artista;

    @Override
    public void exibirFicha() {
        System.out.println("Música: " + getTitulo() + "\nBanda: " +
                getArtista() +"\nTotal de curtidas: " + getTotalCurtidas()
                + "\nTotal de visualizações: " + getTotalReproducoes());
    }

    //getter e setter
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
