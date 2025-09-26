package nivel4.desafioMusica.models;

public class Podcast extends Audio{
    private String apresentador;

    @Override
    public void exibirFicha() {
        System.out.println("Episódio: " + getTitulo() + "\nApresentador: "
                + getApresentador() +
                "\nTotal de curtidas: " + getTotalCurtidas()
                + "\nTotal de visualizações: " + getTotalReproducoes());
    }

    //getter e setter
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
}
