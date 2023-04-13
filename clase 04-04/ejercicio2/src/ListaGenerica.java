import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
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
    //    objetos.sort(Comparator.comparing(Empleado::getLegajo));
        System.out.println("\nLista ordenada.");
    }
    public void desordenarObjetos(){
        Collections.shuffle(objetos);
        System.out.println("\nLista desordenada.");
    }
    public void agregarEnPosicion(Empleado e, int i){
        objetos.add(i, e);
    }
    public void devolverEspecifico(int i){
        System.out.println("\nEmpleado en la posición " + i + ": " + objetos.get(i));
    }
    public void devolverPrimero(){
        System.out.println("\nEmpleado en la primera posición: " + objetos.get(0));
    }
    public void devolverUltimo(){
        int last = objetos.size();
        System.out.println("\nEmpleado en la última posición: " + objetos.get(last-1));
    }
    public void removerEspecifico(int i){
        objetos.remove(i);
        System.out.println("\nEmpleado en la posición " + i + " eliminado.");
    }
}
