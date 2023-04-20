public class Cuadrado implements FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
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
        return "Cuadrado con lado " + lado;
    }
}
