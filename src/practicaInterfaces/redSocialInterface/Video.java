package practicaInterfaces.redSocialInterface;

public class Video implements Interactuable {
    @Override
    public void comentar(String comentario) {
        System.out.println( "Comentó en el video " + comentario);
    }

    @Override
    public void reaccionar (String tipoReaccion) {
        System.out.println("Reaccionó" + tipoReaccion );
    }

    @Override
    public void compartir () {
        System.out.println("Compartió el video");
    }
}
