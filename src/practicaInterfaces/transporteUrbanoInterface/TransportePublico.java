package practicaInterfaces.transporteUrbanoInterface;

public interface TransportePublico {
    void iniciarViaje(String origen, String destino);
    double calcularTarifa();
}