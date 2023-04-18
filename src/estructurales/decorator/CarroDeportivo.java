package estructurales.decorator;

public class CarroDeportivo extends DecoradorCarro {
    public CarroDeportivo(Carro c) {
        super(c);
    }

    @Override
    public void armar(){
        super.armar();
        System.out.print(" Se añaden propiedades de carro deportivo");
    }
}
