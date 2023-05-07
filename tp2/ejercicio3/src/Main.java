import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 40; i++) {
            int valor = rand.nextInt(13) + 3;
            listaNumeros.add(valor);
        }

        Buffer buffer = new Buffer();

        Productor productor = new Productor("Productor", buffer, listaNumeros);
        productor.start();

        for (int i = 0; i < 3; i++) {
            Consumidor consumidor = new Consumidor("Consumidor " + (i + 1), buffer);
            consumidor.start();
        }
    }
}
