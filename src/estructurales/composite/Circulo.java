package estructurales.composite;

public class Circulo implements Figura{
    @Override
    public void dibujar(String fillColor) {
        System.out.println("Dibujando un circulo de color "+fillColor);
    }
}
