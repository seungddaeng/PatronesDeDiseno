package practicaInterfaces.streamingInterface;

public class Documental implements Reproducible {
    private String tema;

    public Documental(String tema) {
        this.tema = tema;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el documental ");
    }

    @Override
    public void pausar() {
        System.out.println("Documental pausado ");
    }

    @Override
    public void detener() {
        System.out.println("Documental detenido ");
    }

    public String getTema() {
        return tema;
    }
}