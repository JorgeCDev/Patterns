package estructurales.composite;

public class Triangulo implements Figura{
    @Override
    public void dibujar(String fillColor) {
        System.out.println("Dibujando un triangulo de color "+fillColor);
    }
}
