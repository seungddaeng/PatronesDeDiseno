package practicaInterfaces.pedidosRestauranteInterface;

public class PedidoDomicilio implements Pedido {
    Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {
        this.repartidor = repartidor;}

    @Override
    public void preparar() {
        System.out.println( "Preparando el pedido para domicilio");
    }

    @Override
    public void entregar() {
        System.out.println( "Entregando el pedido en domicilio");
        repartidor.repartir();
    }
}

