import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        List<Integer> listaNumeros = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i < 40; i++) {
            int valor = rand.nextInt(13) + 3;
            listaNumeros.add(valor);
        }
        HiloFacto hf = new HiloFacto("Calculador", listaNumeros);
        hf.start();
    }
}
