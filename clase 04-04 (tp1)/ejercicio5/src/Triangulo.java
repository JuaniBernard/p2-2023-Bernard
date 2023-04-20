import excepciones.ValorNegativoException;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double posX;
    private double posY;

    public Triangulo(double lado1, double lado2, double lado3, double posX, double posY) throws ValorNegativoException {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new ValorNegativoException("Los lados del triángulo no pueden ser negativos o iguales a cero");
        }
        if (posX < 0) {
            throw new ValorNegativoException("La posición en X no puede ser negativa");
        }
        if (posY < 0) {
            throw new ValorNegativoException("La posición en Y no puede ser negativa");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.posX = posX;
        this.posY = posY;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws ValorNegativoException {
        if (lado1 <= 0) {
            throw new ValorNegativoException("El lado del triángulo no puede ser negativo o igual a cero");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws ValorNegativoException {
        if (lado2 <= 0) {
            throw new ValorNegativoException("El lado del triángulo no puede ser negativo o igual a cero");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws ValorNegativoException {
        if (lado3 <= 0) {
            throw new ValorNegativoException("El lado del triángulo no puede ser negativo o igual a cero");
        }
        this.lado3 = lado3;
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
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularSuperficie() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public String toString() {
        return "Triángulo con lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 + ", ubicado en (" + posX + ", " + posY + ")";
    }

}
