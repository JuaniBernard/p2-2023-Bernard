import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.NoSuchElementException;

public class ListaGenerica {
    protected List<Empleado> objetos = new ArrayList<>();

    public ListaGenerica(){
    }
    public void agregarObjeto(Empleado e) {
        objetos.add(e);
        System.out.println("\nAgregado.");
    }
    public void devolverObjetos(){
        System.out.println("\nLista de objetos:");
        for (Empleado e : objetos) {
            System.out.println(e);
        }
    }
    public void contarObjetos(){
        System.out.println("\nLa cantidad de elementos almacenados en la lista es " + objetos.size() + ".");
    }
    public void agregarAlPrincipio(Empleado e){
        objetos.add(0, e);
        System.out.println("\nSe agregó el empleado al principio.");
    }
    public void ordenarObjetos(){
        Collections.sort(objetos);
        System.out.println("\nLista ordenada.");
    }
    public void desordenarObjetos(){
        Collections.shuffle(objetos);
        System.out.println("\nLista desordenada.");
    }
    public void agregarEnPosicion(Empleado e, int i) {
        if (i > objetos.size()) {
            throw new IndexOutOfBoundsException("El índice es mayor que la cantidad de elementos en la lista.");
        } else {
            objetos.add(i, e);
            System.out.println("\nEmpleado agregado en la posición " + i);
        }
    }

    public void devolverEspecifico(int i) {
        if (i >= objetos.size()) {
            throw new IndexOutOfBoundsException("El índice es mayor o igual que la cantidad de elementos en la lista.");
        } else {
            System.out.println("\nEmpleado en la posición " + i + ": " + objetos.get(i));
        }
    }

    public void devolverPrimero() {
        if (objetos.isEmpty()) {
            throw new NoSuchElementException("La lista de elementos está vacía.");
        } else {
            System.out.println("\nEmpleado en la primera posición: " + objetos.get(0));
        }
    }

    public void devolverUltimo() {
        if (objetos.isEmpty()) {
            throw new NoSuchElementException("La lista de elementos está vacía.");
        } else {
            int last = objetos.size() - 1;
            System.out.println("\nEmpleado en la última posición: " + objetos.get(last));
        }
    }

    public void removerEspecifico(int i) {
        if (i >= objetos.size()) {
            throw new IndexOutOfBoundsException("El índice es mayor o igual que la cantidad de elementos en la lista (el elemento no existe).");
        } else {
            objetos.remove(i);
            System.out.println("\nEmpleado en la posición " + i + " eliminado.");
        }
    }
}
