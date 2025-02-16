package practicaInterfaces.apredizajeOnlineInterface;

public class CursoExamen implements Curso, Evaluable {
    private int puntaje;

    @Override
    public void iniciar() {
        System.out.println("Iniciando examen en línea...");
    }

    @Override
    public void completar() {
        System.out.println("Examen en línea completado");
    }

    @Override
    public void calificar(int puntaje) {
        this.puntaje = puntaje;
        System.out.println("El examen ha sido calificado con un puntaje de: " + puntaje);
    }
}