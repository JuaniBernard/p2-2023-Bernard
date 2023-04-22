import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        Random rand = new Random();
        int iteracion = rand.nextInt(31) + 10;
        int demora = rand.nextInt(950) + 50;
        HiloT ht = new HiloT("Hilo (Thread)", iteracion, demora);
        ht.start();
    }
}