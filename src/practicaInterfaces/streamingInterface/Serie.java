package practicaInterfaces.streamingInterface;

public class Serie implements Reproducible {
    private int cantidadEpisodios;

    public Serie(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la serie ");
    }

    @Override
    public void pausar() {
        System.out.println("Serie pausada ");
    }

    @Override
    public void detener() {
        System.out.println("Serie detenida ");
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }
}