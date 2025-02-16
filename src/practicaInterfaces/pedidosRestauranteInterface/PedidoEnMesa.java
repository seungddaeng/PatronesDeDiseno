package practicaInterfaces.pedidosRestauranteInterface;

public class PedidoEnMesa implements Pedido {
    @Override
    public void preparar() {
        System.out.println( "Preparando el pedido de mesa");

    }

    @Override
    public void entregar() {
        System.out.println( "Entregando el pedido de mesa");
    }
}
