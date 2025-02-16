package practicaInterfaces.transporteUrbanoInterface;

public class ConductorTaxi implements Conductor {
    @Override
    public void aceptarPasajero() {
        System.out.println("El conductor de taxi está aceptando un pasajero");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("EL conductor de taxi está finalizando el viaje");
    }
}