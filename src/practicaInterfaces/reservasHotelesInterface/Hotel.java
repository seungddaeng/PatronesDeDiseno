package practicaInterfaces.reservasHotelesInterface;

public class Hotel implements Reservas, Calificacion {
    private String nombre;
    private boolean reservado;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.reservado = false;
    }
    @Override
    public void calificar(int estrellas) {
        if(estrellas >=1 && estrellas <=5){
            System.out.println("La calificación del hotel " + nombre + " es de " + estrellas + " estrellas");
        } else {
            System.out.println("La calificación es inválida");
        }
    }
    @Override
    public void reservar(String fecha) {
        if(!reservado){
            reservado = true;
            System.out.println("El Hotel " + nombre + " esta reservado para " + fecha + " .");
        } else {
            System.out.println("El Hotel " + nombre + " ya no se encuentra disponible para reserva.");
        }
    }
    @Override
    public void cancelarReserva() {
        if(reservado){
            reservado = false;
            System.out.println("La reserva del Hotel " + nombre + " fue cancelada.");
        } else {
            System.out.println("No existe ninguna reserva para cancelar");
        }
    }
}
