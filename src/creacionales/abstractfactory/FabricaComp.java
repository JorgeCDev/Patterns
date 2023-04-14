package creacionales.abstractfactory;

import creacionales.factory.Computadora;

public class FabricaComp {
    public static Computadora getComputer(FabricaAbstractaComputadora fabrica){
        return fabrica.creaComputadora();
    }
}
