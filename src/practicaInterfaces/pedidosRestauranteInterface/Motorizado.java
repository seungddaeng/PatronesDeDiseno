package practicaInterfaces.pedidosRestauranteInterface;

public class Motorizado implements Repartidor {
    @Override
    public void repartir() {
        System.out.println("Repartir el pedido a través de motorizado");
    }
}
