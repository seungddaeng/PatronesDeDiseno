package practicaInterfaces.apredizajeOnlineInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la plataforma de aprendizaje online !! uwu");

        Estudiante estudiante = new Estudiante("Minho");

        Curso curso1 = new CursoVideo();
        Curso curso2 = new CursoPDF();
        Curso curso3 = new CursoExamen();

        estudiante.inscribirse(curso1);
        estudiante.inscribirse(curso2);
        estudiante.inscribirse(curso3);

        estudiante.completarCursos();
    }
}