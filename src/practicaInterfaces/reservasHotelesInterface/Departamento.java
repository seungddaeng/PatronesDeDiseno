package practicaInterfaces.reservasHotelesInterface;

public class Departamento implements Reservas {
    private String direccion;
    private boolean reservado;

    public Departamento(String direccion) {
        this.direccion = direccion;
        this.reservado = false;
    }
    @Override
    public void reservar(String fecha) {
        if(!reservado){
            reservado = true;
            System.out.println("El Departamento encontrado en la dirección " + direccion + " está reservado para " + fecha + " .");
        } else {
            System.out.println("El departamento ya no se encuentra disponible para reserva");
        }
    }

    @Override
    public void cancelarReserva() {
        if(reservado){
            reservado = false;
            System.out.println("La reserva del departamento en la dirección " + direccion + " fue cancelada");
        } else {
            System.out.println("No existe ninguna reserva para cancelar");
        }
    }
}
