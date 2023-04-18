package estructurales.decorator;

public class CarroDeLujo extends DecoradorCarro{

    public CarroDeLujo(Carro c) {
        super(c);
    }

    @Override
    public void armar(){
        super.armar();
        System.out.print(" Se añaden propiedades de carro de lujo");
    }
}
