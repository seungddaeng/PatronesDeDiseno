package practicaInterfaces.pagoFacturacionInterface;

public class FacturaFisica implements Facturable {
    public void generarFactura() {
        System.out.println("Se entregó una factura física");
    }
}
