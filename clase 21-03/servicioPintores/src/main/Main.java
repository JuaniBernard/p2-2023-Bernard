package main;
import obreros.*;

public class Main {
    public static void main(String[] args) {
        Pared pared = new Pared();
        Pintor pintor = new Pintor();
        Lijador lijador = new Lijador();
        Parchador parchador = new Parchador();

        while (!pintor.sePuedePintar(pared)) {
            System.out.println(pintor.queFalta(pared));
            if (!lijador.sePuedeLijar(pared)) {
                System.out.println(lijador.queFalta(pared));
                if (!parchador.sePuedeParchar(pared)) {
                    parchador.parchar(pared);
                    System.out.println("Pared parchada.");
                }
                lijador.lijar(pared);
                System.out.println("Pared lijada.");
            }
            pintor.pintar(pared);
            System.out.println("Pared pintada.");
        }
        System.out.println("Pared pintada correctamente!");
    }
}
