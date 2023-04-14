package creacionales.factory;

public class FabricaComputadora {

    public static Computadora getComputer(String type, String ram, String hdd,
                                      String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Servidor".equalsIgnoreCase(type)) return new Servidor(ram, hdd,
                cpu);

        return null;
    }
}
