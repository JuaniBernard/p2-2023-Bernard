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
        HiloR hr_implements = new HiloR("Hilo (Runnable)", iteracion, demora);
        Thread hr = new Thread(hr_implements);
        hr.start();
    }
}
