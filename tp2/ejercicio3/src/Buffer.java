import java.util.ArrayList;
import java.util.List;


class Buffer {
    protected List<Integer> buffer;
    protected int capacidad;
    protected int cantidad;

    public Buffer() {
        this.buffer = new ArrayList<>();
        this.capacidad = 10;
        this.cantidad = 0;
    }

    public synchronized void producir(int valor) throws InterruptedException {
        while (cantidad == capacidad) {
            wait();
        }
        buffer.add(valor);
        cantidad++;
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (cantidad == 0) {
            wait();
        }
        int valor = buffer.remove(0);
        cantidad--;
        notifyAll();
        return valor;
    }

    public synchronized boolean estaVacio() {
        return cantidad == 0;
    }
}
