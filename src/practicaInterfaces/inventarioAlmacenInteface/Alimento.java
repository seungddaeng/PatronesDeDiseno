package practicaInterfaces.inventarioAlmacenInteface;

public class Alimento implements Producto, Almacenable  {

    private int fechaDeCaducidad;
    private String nombreDelAlimento;

    public Alimento(int fechaDeCaducidad, String nombreDelAlimento) {
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.nombreDelAlimento = nombreDelAlimento;

    }


    public void obtenerPrecio() {
        System.out.println("Precio del alimento: Bs. 25 ");
    }

    public void obtenerStock() {
        System.out.println("Stock del alimento: 200 alimentos variados");
    }

    public boolean guardarEnBodega() {
        return this.fechaDeCaducidad > 2024;
    }

    public boolean retirarDeBodega() {
        return this.fechaDeCaducidad < 2025;
    }


}
