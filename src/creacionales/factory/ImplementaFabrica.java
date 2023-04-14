package creacionales.factory;

public class ImplementaFabrica {
    public static void main(String[] args) {
        Computadora pc = FabricaComputadora.getComputer("pc","2 GB","500 GB","2" +
                ".4 " +
                "GHz");
        Computadora server = FabricaComputadora.getComputer("servidor","16 GB",
                "1 TB","2.9 GHz");
        System.out.println("Fabrica PC Config::"+pc);
        System.out.println("Fabrica Servidor Config::"+server);
    }

}
