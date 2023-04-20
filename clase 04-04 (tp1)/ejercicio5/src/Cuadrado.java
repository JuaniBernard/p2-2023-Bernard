import excepciones.ValorNegativoException;

public class Cuadrado implements FiguraGeometrica {
    private double lado;
    private double posX;
    private double posY;

    public Cuadrado(double lado, double posX, double posY) throws ValorNegativoException {
        if (lado <= 0) {
            throw new ValorNegativoException("El lado del cuadrado no puede ser negativo o igual a cero");
        }
        if (posX < 0) {
            throw new ValorNegativoException("La posición en X no puede ser negativa");
        }
        if (posY < 0) {
            throw new ValorNegativoException("La posición en Y no puede ser negativa");
        }
        this.lado = lado;
        this.posX = posX;
        this.posY = posY;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws ValorNegativoException {
        if (lado <= 0) {
            throw new ValorNegativoException("El lado del cuadrado no puede ser negativo o igual a cero");
        }
        this.lado = lado;
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

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularSuperficie() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Cuadrado con lado = " + lado + ", ubicado en (" + posX + ", " + posY + ")";
    }
}
