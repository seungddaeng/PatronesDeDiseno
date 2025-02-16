package practicaInterfaces.transporteUrbanoInterface;

public class Bus implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bus inicia su viaje desde " + origen + " hasta " + destino);
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa del bus...");
        return 10;
    }
}
