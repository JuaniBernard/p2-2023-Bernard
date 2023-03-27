package main;

public class Pared {
    private boolean pintado;
    private boolean lijado;
    private boolean parchado;

    public Pared() {
        this.pintado = false;
        this.lijado = false;
        this.parchado = false;
    }

    public boolean estaPintado() {
        return this.pintado;
    }

    public boolean estaLijado() {
        return this.lijado;
    }

    public boolean estaParchado() {
        return this.parchado;
    }

    public void setPintado(boolean pintado) {
        this.pintado = pintado;
    }

    public void setLijado(boolean lijado) {
        this.lijado = lijado;
    }

    public void setParchado(boolean parchado) {
        this.parchado = parchado;
    }
}
