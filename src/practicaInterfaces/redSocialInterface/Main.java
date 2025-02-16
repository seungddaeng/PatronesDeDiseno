package practicaInterfaces.redSocialInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Red Social UPB !!");
        Foto foto = new Foto();
        Video video = new Video();
        Articulo articulo = new Articulo();
        Usuario usuario1 = new Usuario(video);
        usuario1.interaccion("bueno !!","like");

        Usuario usuario2 = new Usuario(foto);
        usuario2.interaccion("Interesante","like");

        Usuario usuario3 = new Usuario(articulo);
        usuario2.interaccion("Cool","like");

    }
}