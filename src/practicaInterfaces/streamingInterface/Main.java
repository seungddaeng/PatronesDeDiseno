package practicaInterfaces.streamingInterface;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Minho");

        Pelicula pelicula = new Pelicula(120);
        Serie serie = new Serie(10);
        Documental documental = new Documental("historia");

        usuario.agregarFavorito(pelicula);
        usuario.agregarFavorito(serie);
        usuario.agregarFavorito(documental);

        usuario.reproducirFavoritos();
    }
}