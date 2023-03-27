package obreros;
import main.Pared;

public class Lijador {
    public boolean sePuedeLijar(Pared pared) {
        return pared.estaParchado() && pared.estaLijado();
    }

    public String queFalta(Pared pared) {
        if (!pared.estaParchado()) {
            return "Lijador no puede lijar la pared, falta parcharla.";
        } else {
            return "Se puede lijar porque la pared está parchada.";
        }
    }

    public void lijar(Pared pared) {
        pared.setLijado(true);
    }
}
