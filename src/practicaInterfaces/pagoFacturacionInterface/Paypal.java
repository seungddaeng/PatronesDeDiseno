package practicaInterfaces.pagoFacturacionInterface;

public class Paypal implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Se realizó el pago en Paypal con un total de : " + monto);
    }
}
