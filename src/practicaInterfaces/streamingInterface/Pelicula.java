package practicaInterfaces.streamingInterface;

public class Pelicula implements Reproducible {
    private int duracion;

    public Pelicula(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la película " );
    }

    @Override
    public void pausar() {
        System.out.println("Película pausada ");
    }

    @Override
    public void detener() {
        System.out.println("Película detenida ");
    }

    public int getDuracion() {
        return duracion;
    }
}