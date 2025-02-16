package practicaInterfaces.inventarioAlmacenInteface;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento(2023,"arroz");
        Alimento alimento2 = new Alimento(2027,"avena");
        Inventario inventario = new Inventario();
        Electronico electronico = new Electronico();
        Ropa ropa = new Ropa();

        inventario.agregarProducto(alimento);
        inventario.agregarProducto(alimento2);
        inventario.agregarProducto(ropa);
        inventario.agregarProducto(electronico);

        inventario.mostrarInventario();

        inventario.eliminarProducto(electronico);

        inventario.mostrarInventario();
    }
}
