import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", "Perez", 1234, 5);
        Empleado e2 = new Empleado("Maria", "Garcia", 2345, 10);
        Empleado e3 = new Empleado("Pedro", "Lopez", 3456, 2);
        Empleado e4 = new Empleado("Ana", "Fernandez", 4567, 7);
        Empleado e5 = new Empleado("Luis", "Rodriguez", 5678, 3);

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);

        Map<String, Empleado> empleadosMap = new HashMap<>();
        for (Empleado empleado : empleados) {
            String clave = empleado.getApellido() + "," + empleado.getNombre();
            empleadosMap.put(clave, empleado);
        }

        for (String clave : empleadosMap.keySet()) {
            System.out.println(clave + ": " + empleadosMap.get(clave));
        }
        System.out.println("\n");

        // Otra forma para presentar los valores
        for (Map.Entry<String, Empleado> entry : empleadosMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - Empleado: " + entry.getValue());
        }
    }
}
