package practicaInterfaces.gestionEmpleadosInterface;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Administrativo administrativo = new Administrativo(7000);
        Gerente gerente = new Gerente(5000,1000);
        Tecnico tecnico = new Tecnico(2500);

        empresa.contratarNuevosEmpleados(administrativo);
        empresa.contratarNuevosEmpleados(gerente);
        empresa.contratarNuevosEmpleados(tecnico);

        empresa.personasEnLaEmpresa();

        empresa.despedirEmpleados(tecnico);

        empresa.personasEnLaEmpresa();
    }
}