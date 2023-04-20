public class EmpleadoSet extends Empleado {
    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    // Editar equals para ignorar instancias con el mismo legajo que quieren agregarse al set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpleadoSet)) return false;
        EmpleadoSet empleado = (EmpleadoSet) o;
        return legajo == empleado.legajo;
    }

    // Editar hashCode para generar un código hash a partir del entero legajo
    @Override
    public int hashCode() {
        return Integer.hashCode(legajo);
    }
}
