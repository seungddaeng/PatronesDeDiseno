package practicaInterfaces.redSocialInterface;

public class Usuario {
    Interactuable formato;
    public Usuario (Interactuable formato) {
    this.formato = formato;
    }
    public void interaccion (String comentario,String tipoReaccion) {
        formato.comentar(comentario);
        formato.reaccionar(tipoReaccion);
        formato.compartir();
    }
}
