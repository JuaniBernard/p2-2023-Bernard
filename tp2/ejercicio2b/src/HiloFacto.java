import java.util.List;

public class HiloFacto extends Thread {
    protected String nombre;
    public List<Integer> numeros;

    public HiloFacto() {
    }

    public HiloFacto(String nombre, List<Integer> numeros) {
        this.nombre = nombre;
        this.numeros = numeros;
    }

    @Override
    public void run() {
        while (this.numeros.isEmpty() == false) {
            int valor = this.numeros.get(0);
            this.numeros.remove(0);
            int resultado = 1;
            for(int i = 1; i <= valor; i++){
                resultado = resultado * i;
            }
            System.out.println("Hilo " + this.nombre + " procesando la lista. Valor a calcular: " + valor +
                    ". Resultado: " + resultado + ". Quedan " + this.numeros.size() + " elementos en la lista por procesar.\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
