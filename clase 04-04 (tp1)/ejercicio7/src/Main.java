public class Main {
    public static void main(String[] args) {
        String str1 = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10";
        String str2 = "nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10";
        String str3 = "nombre=Pablo ,apellido=Marquez ,legajo=E001, aniosTrabajados=10";
        String str4 = "Nombre=Pablo,apellidO=Marquez ,LEGAJO=E001, ANIOStrabajados=10";
        String str5 = "nombre=Pablo,legajo=E001,aniosTrabajados=10,apellido=Marquez";
        String str6 = "nombre=Pablo,apellido=,legajo=E001,aniosTrabajados=10";
        String str7 = "nombre=Pablo, apellido=Marquez, aniosTrabajados=10";
        String str8 = "apellido=Marquez, legajo=E001, nombre=Pablo, aniosTrabajados=10";
        String str9 = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=0";
        String str10 = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=abc";

        // Crear empleados desde strings
        try {
            Empleado emp1 = Empleado.crearEmpleadoDesdeString(str1);
            Empleado emp2 = Empleado.crearEmpleadoDesdeString(str2);
            Empleado emp3 = Empleado.crearEmpleadoDesdeString(str3);
            Empleado emp4 = Empleado.crearEmpleadoDesdeString(str4);
            Empleado emp5 = Empleado.crearEmpleadoDesdeString(str5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Intentar crear empleados desde strings con excepciones
        try {
            Empleado emp6 = Empleado.crearEmpleadoDesdeString(str6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Empleado emp7 = Empleado.crearEmpleadoDesdeString(str7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Empleado emp8 = Empleado.crearEmpleadoDesdeString(str8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Empleado emp9 = Empleado.crearEmpleadoDesdeString(str9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Empleado emp10 = Empleado.crearEmpleadoDesdeString(str10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
