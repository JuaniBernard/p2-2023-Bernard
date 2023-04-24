public class HiloR implements Runnable {
    protected String nombre;
    protected int iteracion;
    protected int demora;

    public HiloR() {
    }

    public HiloR(String nombre, int iteracion, int demora) {
        this.nombre = nombre;
        this.iteracion = iteracion;
        this.demora = demora;
    }

    @Override
    public void run() {
        for(int i=0; i < this.iteracion; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + this.iteracion + "(" + (i+1) + ")" + "\n");
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
