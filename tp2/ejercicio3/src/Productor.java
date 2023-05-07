import java.util.List;

class Productor extends Thread {
    private String nombre;
    private Buffer buffer;
    private List<Integer> listaNumeros;

    public Productor(String nombre, Buffer buffer, List<Integer> listaNumeros) {
        this.nombre = nombre;
        this.buffer = buffer;
        this.listaNumeros = listaNumeros;
    }

    @Override
    public void run() {
        for (int valor : listaNumeros) {
            try {
                buffer.producir(valor);
                System.out.println("Hilo " + this.nombre + " produjo el valor " + valor);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}