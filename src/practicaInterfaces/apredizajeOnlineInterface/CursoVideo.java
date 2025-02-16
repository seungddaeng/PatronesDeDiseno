package practicaInterfaces.apredizajeOnlineInterface;

public class CursoVideo implements Curso {
    @Override
    public void iniciar() {
        System.out.println("Iniciando curso de video...");
    }

    @Override
    public void completar() {
        System.out.println("Curso de video completado");
    }
}