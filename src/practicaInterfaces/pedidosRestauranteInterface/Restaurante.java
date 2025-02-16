package practicaInterfaces.pedidosRestauranteInterface;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedidos;

    public Restaurante() {
        pedidos = new ArrayList<>();
    }

    public void recibirPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Tenemos un nuevo pedido !! uwu");
    }

    public void gestionarPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.preparar();
            pedido.entregar();
            System.out.println("----------------------------------");
        }
    }
}
