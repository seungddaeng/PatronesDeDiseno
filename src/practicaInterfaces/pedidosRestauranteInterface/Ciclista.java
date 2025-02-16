package practicaInterfaces.pedidosRestauranteInterface;

public class Ciclista implements Repartidor {
    @Override
    public void repartir() {
        System.out.println("Repartir el pedido a través de un ciclista");
    }
}
