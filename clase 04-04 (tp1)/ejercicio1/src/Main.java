import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Set de Empleado
        Set<Empleado> empleados = new HashSet<>();

        Empleado empleado1 = new Empleado("Juan", "Pérez", 123, 5);
        Empleado empleado2 = new Empleado("María", "González", 234, 3);
        Empleado empleado3 = new Empleado("Pedro", "García", 345, 2);
        Empleado empleado4 = new Empleado("Juan", "Pérez", 123, 5);
        Empleado empleado5 = new Empleado("Luisa", "Medina", 456, 1);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        // Set de EmpleadoSet
        Set<EmpleadoSet> empleadosSet = new HashSet<>();

        EmpleadoSet empleadoSet1 = new EmpleadoSet("Juan", "Pérez", 123, 5);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("María", "González", 234, 3);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Pedro", "García", 345, 2);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Juan", "Pérez", 123, 5);
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Luisa", "Medina", 456, 1);

        empleadosSet.add(empleadoSet1);
        empleadosSet.add(empleadoSet2);
        empleadosSet.add(empleadoSet3);
        empleadosSet.add(empleadoSet4);
        empleadosSet.add(empleadoSet5);

        System.out.println("\nEmpleadosSet:");
        for (EmpleadoSet empleadoSet : empleadosSet) {
            System.out.println(empleadoSet);
        }
    }
}
