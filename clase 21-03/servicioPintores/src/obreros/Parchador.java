package obreros;
import main.Pared;

public class Parchador {
    public boolean sePuedeParchar(Pared pared) {
        return pared.estaParchado();
    }

    public void parchar(Pared pared) {
        pared.setParchado(true);
    }
}
