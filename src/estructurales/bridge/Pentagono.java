package estructurales.bridge;

public class Pentagono extends Figura{
    public Pentagono(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagono de color ");
        color.applyColor();
    }
}
