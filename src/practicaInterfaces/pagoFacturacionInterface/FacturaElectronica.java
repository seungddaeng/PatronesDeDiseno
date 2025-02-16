package practicaInterfaces.pagoFacturacionInterface;

public class FacturaElectronica implements Facturable {
    public void generarFactura() {
        System.out.println("La factura electrónica se mandó al correo ");
    }
}
