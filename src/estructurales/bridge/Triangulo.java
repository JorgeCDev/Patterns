package estructurales.bridge;

public class Triangulo extends Figura {
    public Triangulo(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangulo de color ");
        color.applyColor();
    }
}
