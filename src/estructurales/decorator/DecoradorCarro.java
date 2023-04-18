package estructurales.decorator;

public class DecoradorCarro implements Carro {
    protected Carro carro;
    public DecoradorCarro(Carro c){
        this.carro=c;
    }

    @Override
    public void armar() {
        this.carro.armar();
    }
}
