package practicaInterfaces.recomendacionesInterface;

import java.util.List;

class UsuarioRegular implements Recomendable {
    private String nombre;
    private List<Producto> masVendidos;
    public UsuarioRegular(String nombre, List<Producto> masVendidos) {
        this.nombre = nombre;
        this.masVendidos = masVendidos;
    }

    public void obtenerRecomendaciones() {
        System.out.println("Recomendaciones para el usuario regular " + nombre + ":");
        for (Producto p : masVendidos) {
            System.out.println("- Productos más vendidos como " + p.getNombre() + " en la categoría de "
                    + p.getCategoria() + " con un precio de " + p.getPrecio());
        }
    }
}
