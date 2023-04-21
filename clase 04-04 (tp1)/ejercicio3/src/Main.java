import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        // Instanciar una lista
        ListaGenerica lista1 = new ListaGenerica();

        // Generando excepción para agregarEnPosicion

        try {
            lista1.agregarEnPosicion(new Empleado("Juan", "Pérez", 123, 5), 5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción al agregar en posición: " + e.getMessage());
        }

        // Generando excepción para devolverEspecifico
        try {
            lista1.devolverEspecifico(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción al devolver elemento específico: " + e.getMessage());
        }

        // Generando excepción para devolverPrimero
        try {
            lista1.devolverPrimero();
        } catch (NoSuchElementException e) {
            System.out.println("Excepción al devolver primer elemento: " + e.getMessage());
        }
        // Generando excepción para devolverUltimo
        try {
            lista1.devolverUltimo();
        } catch (NoSuchElementException e) {
            System.out.println("Excepción al devolver último elemento: " + e.getMessage());
        }

        // Generando excepción para removerEspecifico
        try {
            lista1.removerEspecifico(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Excepción al remover elemento específico: " + e.getMessage());
        }

        // Definir empleados
        Empleado empleado1 = new Empleado("Juan", "Pérez", 123, 5);
        Empleado empleado2 = new Empleado("María", "González", 234, 3);
        Empleado empleado3 = new Empleado("Pedro", "García", 345, 2);
        Empleado empleado4 = new Empleado("Jorge", "Guzmán", 567, 4);
        Empleado empleado5 = new Empleado("Luisa", "Medina", 456, 1);

        // Agregarlos a la lista
        lista1.agregarObjeto(empleado1);
        lista1.agregarObjeto(empleado2);
        lista1.agregarObjeto(empleado3);
        lista1.agregarObjeto(empleado4);
        lista1.agregarObjeto(empleado5);

        // Devolver todos los empleados de la lista
        lista1.devolverObjetos();

        // Ordenar la lista
        lista1.ordenarObjetos();

        // Devolver todos los empleados de la lista
        lista1.devolverObjetos();

        // Agregar un nuevo empleado al principio de la lista
        lista1.agregarAlPrincipio(new Empleado("Luis", "López", 235, 1));

        // Devolver el primer y último empleado de la lista
        lista1.devolverPrimero();
        lista1.devolverUltimo();

        // Remover un empleado específico de la lista
        lista1.removerEspecifico(2);

        // Desordenar la lista
        lista1.desordenarObjetos();

        // Agregar empleado en posición específica
        lista1.agregarEnPosicion(new Empleado("Marta", "Noya", 124, 3), 4);

        // Devolver un empleado específico
        lista1.devolverEspecifico(5);

        // Contar cantidad de empleados en la lista
        lista1.contarObjetos();

        // Devolver todos los empleados de la lista
        lista1.devolverObjetos();
    }
}
