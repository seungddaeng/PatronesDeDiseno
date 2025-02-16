package practicaInterfaces.pagoFacturacionInterface;

public class TransferenciaBancaria implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Se realizó el pago con transferencia bancaria con un total de : " + monto);
    }
}
