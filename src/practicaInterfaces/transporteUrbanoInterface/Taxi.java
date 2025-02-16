package practicaInterfaces.transporteUrbanoInterface;

public class Taxi implements TransportePublico {
    private Conductor conductor;

    public Taxi(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Taxi inicia su viaje desde " + origen + " hasta " + destino);
        conductor.aceptarPasajero();
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa del taxi");
        return 50;
    }
}