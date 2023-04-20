import excepciones.ValorNegativoException;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double posX;
    private double posY;

    public Circulo(double radio, double posX, double posY) throws ValorNegativoException {
        if (radio <= 0) {
            throw new ValorNegativoException("El radio no puede ser negativo o igual a cero");
        }
        if (posX < 0) {
            throw new ValorNegativoException("La posición en X no puede ser negativa");
        }
        if (posY < 0) {
            throw new ValorNegativoException("La posición en Y no puede ser negativa");
        }
        this.radio = radio;
        this.posX = posX;
        this.posY = posY;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ValorNegativoException {
        if (radio <= 0) {
            throw new ValorNegativoException("El radio no puede ser negativo o igual a cero");
        }
        this.radio = radio;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) throws ValorNegativoException {
        if (posX < 0) {
            throw new ValorNegativoException("La posición en X no puede ser negativa");
        }
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) throws ValorNegativoException {
        if (posY < 0) {
            throw new ValorNegativoException("La posición en Y no puede ser negativa");
        }
        this.posY = posY;
    }

    public String toString() {
        return "Círculo con radio = " + radio + ", ubicado en (" + posX + ", " + posY + ")";
    }
}
