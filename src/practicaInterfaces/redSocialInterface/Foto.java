package practicaInterfaces.redSocialInterface;

public class Foto implements Interactuable {
    @Override
    public void comentar(String comentario) {
        System.out.println( "Comentó " + comentario);
    }

    @Override
    public void reaccionar (String tipoReaccion) {
        System.out.println("Reacciono " + tipoReaccion );
    }

    @Override
    public void compartir () {
        System.out.println("compartio la foto");
    }
}
