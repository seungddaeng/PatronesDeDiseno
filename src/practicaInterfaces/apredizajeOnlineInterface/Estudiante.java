package practicaInterfaces.apredizajeOnlineInterface;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Curso> cursosInscritos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursosInscritos = new ArrayList<>();
    }

    public void inscribirse(Curso curso) {
        cursosInscritos.add(curso);
        System.out.println(nombre + " se ha inscrito en un nuevo curso");
    }

    public void completarCursos() {
        for (Curso curso : cursosInscritos) {
            curso.iniciar();
            curso.completar();
            if (curso instanceof CursoExamen) {
                ((CursoExamen) curso).calificar(100);
            }
            System.out.println("----------------------------------");
        }
    }
}