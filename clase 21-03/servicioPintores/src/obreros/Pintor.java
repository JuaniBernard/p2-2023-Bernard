package obreros;
import main.Pared;

public class Pintor {
    public boolean sePuedePintar(Pared pared) {
        return pared.estaParchado() && pared.estaLijado() && pared.estaPintado();
    }

    public String queFalta(Pared pared) {
        if (!pared.estaLijado()) {
            return "Pintor no puede pintar la pared, falta lijarla.";
        } else {
            return "Se puede pintar porque la pared está lijada.";
        }
    }

    public void pintar(Pared pared) {
        pared.setPintado(true);
    }
}
