import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Triangulo(3, 4, 5));
        figuras.add(new Cuadrado(2));
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(5));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
    }
}
