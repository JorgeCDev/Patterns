package estructurales.composite;
//se utiliza para que un grupo de objetos se comporte como uno solo
public class ImplementaComposite {
    public static void main(String[] args) {

        Figura tri = new Triangulo();
        Figura tri1 = new Triangulo();
        Figura cir = new Circulo();

        Dibujo drawing = new Dibujo();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.dibujar("Rojo");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.dibujar("Verde");
    }
}
