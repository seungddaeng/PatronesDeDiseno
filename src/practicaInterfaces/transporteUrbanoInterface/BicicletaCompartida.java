package practicaInterfaces.transporteUrbanoInterface;

public class BicicletaCompartida implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bicicleta compartida inicia su viaje desde " + origen + " hasta " + destino);
    }

    @Override
    public double calcularTarifa() {
        System.out.println("Calculando tarifa de la bicicleta compartida...");
        return 2;
    }
}