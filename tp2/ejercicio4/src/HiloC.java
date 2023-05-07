import java.util.concurrent.Callable;

class HiloC implements Callable<Integer> {
    protected String nombre;
    protected int iteracion;
    protected int demora;

    public HiloC() {
    }

    public HiloC(String nombre, int iteracion, int demora) {
        this.nombre = nombre;
        this.iteracion = iteracion;
        this.demora = demora;
    }

    @Override
    public Integer call() throws Exception {
        for(int i=0; i < this.iteracion; i++) {
            System.out.println("Este es el hilo " + this.nombre + " y esta es la iteración " + this.iteracion + "(" + (i+1) + ")" + "\n");
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.iteracion;
    }
}