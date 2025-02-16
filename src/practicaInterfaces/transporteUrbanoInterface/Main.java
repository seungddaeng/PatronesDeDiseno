package practicaInterfaces.transporteUrbanoInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la plataforma de transporte Urbano !!");

        Conductor conductor = new ConductorTaxi();
        TransportePublico taxi = new Taxi(conductor);
        TransportePublico bus = new Bus();
        TransportePublico bicicleta = new BicicletaCompartida();

        Usuario usuario = new Usuario("Seung");

        usuario.solicitarViaje(taxi, "Casita", "Uni");
        usuario.solicitarViaje(bus, "La Paz", "Cochabamba");
        usuario.solicitarViaje(bicicleta, "Teleférico1", "Teleférico2");
    }
}