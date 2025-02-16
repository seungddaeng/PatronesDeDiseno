package practicaInterfaces.recomendacionesInterface;

import java.util.List;

class UsuarioPremium implements Recomendable {
    private String nombre;
    private List<Producto> historialCompras;

    public UsuarioPremium(String nombre, List<Producto> historialCompras) {
        this.nombre = nombre;
        this.historialCompras = historialCompras;
    }

    public void obtenerRecomendaciones() {
        System.out.println("Recomendaciones para ti usuario premium " + nombre + ":");
        for (Producto p : historialCompras) {
            System.out.println("- Productos similares a " + p.getNombre() + " de la categoría de "
                    + p.getCategoria() + " con un preciso de " + p.getPrecio());
        }
    }
}
