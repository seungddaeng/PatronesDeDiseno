package practicaInterfaces.pagoFacturacionInterface;

public class TarjetaCredito implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Se realizó el pago con tarjeta de crédito con total de : " + monto);
    }
}
