package practicaInterfaces.gestionEmpleadosInterface;

public class Administrativo implements Empleado {
    private int salario;

    public Administrativo(int salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("El salario del administrativo es de: "+salario);
    }

    @Override
    public String toString() {
        return "Administrativo";
    }

    public void obtenerCargo() {
        System.out.println("El cargo de este empleado es: " + this);
    }
}
