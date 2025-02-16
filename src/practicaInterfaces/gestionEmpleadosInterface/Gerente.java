package practicaInterfaces.gestionEmpleadosInterface;

public class Gerente implements Empleado, Bonificable {
    private int salario;
    private int bono;

    public Gerente(int salario, int bono) {
        this.salario = salario;
        this.bono = bono;
    }

    public void calcularSalario() {
        System.out.println("El salario del administrativo es de: "+salario);
    }

    @Override
    public String toString() {
        return "Gerente";
    }

    public void obtenerCargo() {
        System.out.println("El cargo de este empleado es: " + this);
    }

    public void calcularBono() {
        int total = bono+salario;
        System.out.println("El bono de este empleado es: " + bono + " y junto a su salario hace un total de: " + total );
    }
}
