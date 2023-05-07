import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        Random rand = new Random();
        int iteracion = rand.nextInt(31) + 10;
        int demora = rand.nextInt(950) + 50;
        HiloC hc = new HiloC("Hilo (Callable)", iteracion, demora);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(hc);

        try {
            int resultado = future.get();
            if (resultado > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
    }
}