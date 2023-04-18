package estructurales.bridge;
//Desacopla una abstraccion de su implementacion
public class ImplementaBridge {
    public static void main(String[] args) {
        Figura tri = new Triangulo(new ColorRojo());
        tri.applyColor();

        Figura pent = new Pentagono(new ColorVerde());
        pent.applyColor();
    }
}
