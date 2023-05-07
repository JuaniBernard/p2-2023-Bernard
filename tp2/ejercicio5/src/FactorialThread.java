import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialThread implements Callable<Integer> {
    private String name;
    private List<Integer> list;

    public FactorialThread(String name, List<Integer> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        while (!list.isEmpty()) {
            int value = list.remove(0);
            for (int i = 2; i <= value; i++) {
                result *= i;
            }
            Thread.sleep(5000);
            System.out.println(String.format("Hilo %s procesando la lista. Valor a calcular: %d. Resultado: %d. Quedan %d elementos en la lista por procesar.",
                    name, value, result, list.size()));
            if (result > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            int value = (int) (Math.random() * 13) + 3;
            list.add(value);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        futures.add(executorService.submit(new FactorialThread("Hilo 1", list)));
        futures.add(executorService.submit(new FactorialThread("Hilo 2", list)));
        futures.add(executorService.submit(new FactorialThread("Hilo 3", list)));
        executorService.shutdown();
        for (Future<Integer> future : futures) {
            System.out.println("Resultado: " + future.get());
        }
    }
}
