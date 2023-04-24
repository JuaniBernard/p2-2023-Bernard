import java.util.Random;

public class HiloT extends Thread {
    protected String nombre;

    public HiloT() {
    }

    public HiloT(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int iteracion = rand.nextInt(31) + 10;
        int demora = rand.nextInt(950) + 50;
        for(int i=0; i < iteracion; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + iteracion + "(" + (i+1) + ")" + "\n");
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.nombre + "(" + iteracion + ")" + " terminado\n");
    }
}
