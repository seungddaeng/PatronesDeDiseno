package practicaInterfaces.reservasHotelesInterface;

public class Cliente {
    private String nombre;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public void hacerReserva(Reservas lugar, String fecha) {
        System.out.println("El cliente " + nombre + " está realizando una reserva");
        lugar.reservar(fecha);
    }
    public void cancelarReserva(Reservas lugar) {
        System.out.println("El cliente " + nombre + " está cancelando una reserva");
        lugar.cancelarReserva();
    }

    public void calificar(Hotel hotel, int estrellas) {
        System.out.println("El cliente " + nombre + " está calificando el lugar de su reserva");
        hotel.calificar(estrellas);
    }
}
