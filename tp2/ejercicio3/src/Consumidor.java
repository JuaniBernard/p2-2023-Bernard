class Consumidor extends Thread {
    private String nombre;
    private Buffer buffer;

    public Consumidor(String nombre, Buffer buffer) {
        this.nombre = nombre;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (!buffer.estaVacio()) {
            try {
                int valor = buffer.consumir();
                int resultado = 1;
                for (int i = 1; i <= valor; i++) {
                    resultado = resultado * i;
                }
                System.out.println("Hilo " + this.nombre + " procesando la lista. Valor a calcular: " + valor +
                        ". Resultado: " + resultado + ". Quedan " + buffer.cantidad + " elementos en la lista por procesar.\n");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}