import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        // Usar el método synchronizedList() para crear una lista sincronizada a prueba de hilos
        List<Integer> listaNumeros = Collections.synchronizedList(new ArrayList<>());
        Random rand = new Random();
        for(int i = 0; i < 40; i++) {
            int valor = rand.nextInt(13) + 3;
            listaNumeros.add(valor);
        }
        for(int i = 0; i < 3; i++) {
            HiloFacto hf = new HiloFacto("Calculador " + (i+1), listaNumeros);
            hf.start();
        }
    }
}
