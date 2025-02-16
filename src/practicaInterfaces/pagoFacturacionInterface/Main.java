package practicaInterfaces.pagoFacturacionInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda UPB");
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        Paypal paypal = new Paypal();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        FacturaElectronica facturaElectronica = new FacturaElectronica();
        FacturaFisica facturaFisica = new FacturaFisica();
        Compra compraPayPal = new Compra(paypal,facturaElectronica);
        compraPayPal.compraHecha(100);
        Compra compraFisica = new Compra(transferenciaBancaria,facturaFisica);
        compraFisica.compraHecha(200);
        Compra compraElectronica = new Compra(tarjetaCredito,facturaElectronica);
        compraElectronica.compraHecha(300);

    }
}