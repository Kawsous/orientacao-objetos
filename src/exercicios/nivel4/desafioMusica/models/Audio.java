package nivel4.desafioMusica.models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;

    public void exibirFicha() {
        System.out.println("Música: " + getTitulo() +
                "\nTotal de curtidas: " + getTotalCurtidas()
                + "\nTotal de visualizações: " + getTotalReproducoes());
    }

    //getter e setter
    public void curte() {
        totalCurtidas++;
    }

    public void reproduz() {
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}
