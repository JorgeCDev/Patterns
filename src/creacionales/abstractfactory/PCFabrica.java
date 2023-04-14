package creacionales.abstractfactory;

import creacionales.factory.Computadora;
import creacionales.factory.PC;

public class PCFabrica implements FabricaAbstractaComputadora {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFabrica(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computadora creaComputadora() {
        return new PC(ram,hdd,cpu);
    }
}
