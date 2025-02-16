package practicaInterfaces.pagoFacturacionInterface;

public class Compra {
    MetodoPago formaPago;
    Facturable tipoFactura;
    public Compra(MetodoPago formaPago, Facturable tipoFactura){
        this.formaPago = formaPago;
        this.tipoFactura = tipoFactura;
    }
    public void compraHecha(double monto){
        formaPago.procesarPago(monto);
        tipoFactura.generarFactura();
    }
}
