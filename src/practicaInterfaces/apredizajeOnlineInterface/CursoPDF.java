package practicaInterfaces.apredizajeOnlineInterface;

public class CursoPDF implements Curso {
    @Override
    public void iniciar() {
        System.out.println("Iniciando curso en formato PDF interactivo...");
    }

    @Override
    public void completar() {
        System.out.println("Curso en formato PDF completado");
    }
}