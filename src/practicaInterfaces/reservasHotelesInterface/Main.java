package practicaInterfaces.reservasHotelesInterface;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Minho");
        Cliente cliente2 = new Cliente("Felix");
        Cliente cliente3 = new Cliente("Christopher");

        System.out.println("-------------------------------------");

        Hotel hotel = new Hotel("Hotel Paraiso");
        Departamento departamento = new Departamento("Calle Cool #0325");
        CasaVacaciones casa = new CasaVacaciones("Playa Paraíso");

        cliente.hacerReserva(hotel, "25 de marzo");
        System.out.println("-------------------------------------");
        cliente2.hacerReserva(departamento, "4 de abril");
        System.out.println("-------------------------------------");
        cliente3.hacerReserva(casa, "15 de septiembre");
        System.out.println("-------------------------------------");

        cliente3.cancelarReserva(departamento);

        System.out.println("-------------------------------------");

        cliente2.calificar(hotel, 5);
    }
}