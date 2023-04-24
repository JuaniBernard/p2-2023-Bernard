public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        HiloT ht = new HiloT("Hilo (Thread)");
        ht.start();
    }
}