package practicaInterfaces.inventarioAlmacenInteface;

public class Electronico  implements Producto {

    public void obtenerPrecio() {
        System.out.println("Precio del Electrónico: Bs. 1000 ");
    }

    public void obtenerStock() {
        System.out.println("Stock del Electrónico: 50 electrónicos");
    }
}
