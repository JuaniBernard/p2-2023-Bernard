import excepciones.ValorNegativoException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<FiguraGeometrica> figuras = new ArrayList<>();
            figuras.add(new Circulo(5, 2, 3));
            figuras.add(new Triangulo(3, 4, 5, 1, 2));
            figuras.add(new Cuadrado(4, 3, 4));
            figuras.add(new Circulo(3, 0, 0));
            figuras.add(new Triangulo(2, 2, 3, 4, 2));

            for (FiguraGeometrica figura : figuras) {
                System.out.println(figura.toString());
                System.out.println("Perímetro: " + figura.calcularPerimetro());
                System.out.println("Superficie: " + figura.calcularSuperficie());
                System.out.println();
            }
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }
        // Generando excepciones a propósito
        try {
            Cuadrado cuadrado = new Cuadrado(-2, 3, 4); // Lado negativo
        }
        catch (ValorNegativoException e){
            System.out.println(e.getMessage());
        }
        try {
            Triangulo triangulo1 = new Triangulo(3, 4, 4, 3, -6); // Posición negativa
        }
        catch (ValorNegativoException e){
            System.out.println(e.getMessage());
        }
        try {
            Triangulo triangulo2 = new Triangulo(3, 4, 4, 3, 6);
            triangulo2.setLado1(-4); // Setter lado negativo
        }
        catch (ValorNegativoException e){
            System.out.println(e.getMessage());
        }
        try {
            Circulo circulo = new Circulo(1, 5, 4);
            circulo.setPosX(-8); // Setter posición negativo
        }
        catch (ValorNegativoException e){
            System.out.println(e.getMessage());
        }
    }
}
