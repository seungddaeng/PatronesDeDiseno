package practicaInterfaces.transporteUrbanoInterface;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        System.out.println(nombre + " solicitó un viaje.");
        transporte.iniciarViaje(origen, destino);
        double tarifa = transporte.calcularTarifa();
        System.out.println("La tarifa del viaje es: Bs. " + tarifa);
        System.out.println("----------------------------------");
    }
}