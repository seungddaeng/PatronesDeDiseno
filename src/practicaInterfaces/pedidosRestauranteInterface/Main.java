package practicaInterfaces.pedidosRestauranteInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurant UPB !!");

        PedidoParaLlevar pedido1 = new PedidoParaLlevar();
        PedidoEnMesa pedido2 = new PedidoEnMesa();

        Motorizado motorizado = new Motorizado();
        //Simular que un pedido será enviado por un repartidor motorizado
        PedidoDomicilio pedido3 = new PedidoDomicilio(motorizado);
        Ciclista ciclista = new Ciclista();

        //Simular que un pedido será enviado por un repartidor ciclista
        PedidoDomicilio pedido4 = new PedidoDomicilio(ciclista);

        Restaurante restaurante = new Restaurante();

        restaurante.recibirPedido(pedido1);
        restaurante.recibirPedido(pedido2);
        restaurante.recibirPedido(pedido3);
        restaurante.recibirPedido(pedido4);

        restaurante.gestionarPedidos();
    }
}