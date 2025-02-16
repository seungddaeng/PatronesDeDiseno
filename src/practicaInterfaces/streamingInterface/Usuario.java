package practicaInterfaces.streamingInterface;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Reproducible> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public void agregarFavorito(Reproducible contenido) {
        favoritos.add(contenido);
        System.out.println(nombre + " ha agregado a favoritos " + contenido.getClass().getSimpleName());
    }

    public void reproducirFavoritos() {
        System.out.println(nombre + " está reproduciendo su lista de favoritos");
        for (Reproducible contenido : favoritos) {
            contenido.reproducir();
        }
    }
}
