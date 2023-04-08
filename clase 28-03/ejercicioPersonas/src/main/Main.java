package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");
        listaNombres.add("Luisa");
        listaNombres.add("Jorge");

        List<String> listaApellidos = new ArrayList<>();
        listaApellidos.add("González");
        listaApellidos.add("Martínez");
        listaApellidos.add("García");
        listaApellidos.add("Medina");
        listaApellidos.add("Torres");

        List<Persona> personas = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int edad = rand.nextInt(31) + 20;
            Persona p = new Persona(listaNombres.get(i), listaApellidos.get(i), edad);
            personas.add(p);
        }

        System.out.println("Lista de personas:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        Persona personaMayor = personas.get(0);
        for (Persona p : personas) {
            if (p.getEdad() > personaMayor.getEdad()) {
                personaMayor = p;
            }
        }
        System.out.printf("La persona más grande es: %s", personaMayor);
    }
}
