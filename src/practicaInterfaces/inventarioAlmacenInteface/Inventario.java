package practicaInterfaces.inventarioAlmacenInteface;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto (Producto producto) {
        if (producto instanceof Alimento) {
            Alimento alimento = (Alimento) producto;
            if (!alimento.retirarDeBodega()) {
                productos.add(alimento);
                System.out.println("Alimento agregado con éxito, no está vencido !!");
            } else {
                System.out.println("Este alimento está vencido, no se puede agregar al inventario ):");
            }
        } else {
            productos.add(producto);
            System.out.println("Producto agregado al inventario");
        }
    }



    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado del inventario ");
        } else {
            System.out.println("Producto no encontrado en el inventario ");
        }
    }

    public void mostrarInventario() {
        System.out.println("======= Inventario Actual =======");
        for (Producto producto : productos) {
            producto.obtenerPrecio();
            producto.obtenerStock();
            System.out.println("--------------------------------");
        }
    }

}


