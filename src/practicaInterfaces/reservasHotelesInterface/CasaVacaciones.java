package practicaInterfaces.reservasHotelesInterface;

public class CasaVacaciones implements Reservas {
    private String ubicacion;
    private boolean reservado;

    public CasaVacaciones(String ubicacion) {
        this.ubicacion = ubicacion;
        this.reservado = false;
    }
    @Override
    public void reservar(String fecha) {
        if(!reservado){
            reservado = true;
            System.out.println("La casa vacacional ubicada en la dirección " + ubicacion + " está reservada para " + fecha + " .");
        } else {
            System.out.println("La casa vacacional ya no se encuentra disponible para reserva");
        }
    }

    @Override
    public void cancelarReserva() {
        if(reservado){
            reservado = false;
            System.out.println("La reserva de la casa vacacional ubicada en " + ubicacion + " fue cancelada.");
        } else {
            System.out.println("No existe ninguna reserva para cancelar.");
        }
    }
}
