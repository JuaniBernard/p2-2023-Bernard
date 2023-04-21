import java.util.regex.Matcher;
import java.util.regex.Pattern;
import excepciones.EmpleadoFormatException;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", aniosTrabajados=" + aniosTrabajados +
                '}';
    }

    public static Empleado crearEmpleadoDesdeString(String str) throws EmpleadoFormatException {
        /* Esta regex "(?i)nombre=([a-z]+)\\s*,?\\s*apellido=([a-z]+)\\s*,?\\s*legajo=([a-zA-Z0-9]+)\\s*,?\\s*aniosTrabajados=(\\d+)" funcionaba pero el orden
        en el que se escribían los atributos tenía que ser la misma */
        Pattern pattern = Pattern.compile("(?i)^(?=.*nombre=)(?=.*apellido=)(?=.*legajo=)(?=.*aniosTrabajados=)\\s*(?:nombre=([a-z]+)\\s*,?\\s*|apellido=([a-z]+)\\s*,?\\s*|legajo=([a-zA-Z0-9]+)\\s*,?\\s*|aniosTrabajados=(\\d+)\\s*,?\\s*){4}$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            String nombre = matcher.group(1);
            String apellido = matcher.group(2);
            String legajo = matcher.group(3);
            int aniosTrabajados = Integer.parseInt(matcher.group(4));
            if (nombre.isEmpty() || apellido.isEmpty() || legajo.isEmpty() || aniosTrabajados <= 0) {
                throw new EmpleadoFormatException("Formato inválido: " + str + " / Todos los campos deben tener datos y aniosTrabajados ("+ aniosTrabajados + " en este caso) debe ser mayor a cero.");
            }
            return new Empleado(nombre, apellido, legajo, aniosTrabajados);
        } else {
            throw new EmpleadoFormatException("Formato inválido: " + str);
        }
    }
}
