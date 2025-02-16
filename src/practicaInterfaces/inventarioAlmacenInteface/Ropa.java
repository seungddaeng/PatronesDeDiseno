package practicaInterfaces.inventarioAlmacenInteface;

public class Ropa implements Producto {
    public void obtenerPrecio() {
        System.out.println("Precio del ropa: Bs. 400");
    }
    public void obtenerStock() {
        System.out.println("Stock ropa: 50 prendas");
    }
}
