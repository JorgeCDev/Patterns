package creacionales.abstractfactory;

import creacionales.factory.Computadora;
import creacionales.factory.Servidor;

public class ServidorFabrica implements FabricaAbstractaComputadora{

    private String ram;
    private String hdd;
    private String cpu;

    public ServidorFabrica(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computadora creaComputadora() {
        return new Servidor(ram,hdd,cpu);
    }
}
