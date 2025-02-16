package practicaInterfaces.redSocialInterface;

public class Articulo implements Interactuable {
    @Override
    public void comentar(String comentario) {
        System.out.println( "Comentó el artículo" + comentario);
    }

    @Override
    public void reaccionar (String tipoReaccion) {
        System.out.println("Reaccionó al artículo" + tipoReaccion );
    }

    @Override
    public void compartir () {
        System.out.println("Compartió el artículo");
    }
}
