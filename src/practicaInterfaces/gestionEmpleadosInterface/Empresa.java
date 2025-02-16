package practicaInterfaces.gestionEmpleadosInterface;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Empleado> empleadosContratados = new ArrayList<>();

    public void contratarNuevosEmpleados(Empleado empleado){
        empleadosContratados.add(empleado);
        System.out.println("Bienvenido a la empresa " + empleado + " !!");
    }

    public void personasEnLaEmpresa(){
        System.out.println("-----------------------");
        System.out.println("Personas en la empresa:");
        for(Empleado empleado : empleadosContratados){
            if(empleado instanceof Gerente){
                Gerente gerente = (Gerente) empleado;
                gerente.obtenerCargo();
                gerente.calcularSalario();
                gerente.calcularBono();
            } else {
                empleado.obtenerCargo();
                empleado.calcularSalario();
            }
        }
        System.out.println("---------------------");
    }

    public void despedirEmpleados(Empleado empleado){
        empleadosContratados.remove(empleado);
        System.out.println(empleado + " incumplió con su contrato, está despedido");
    }
}
