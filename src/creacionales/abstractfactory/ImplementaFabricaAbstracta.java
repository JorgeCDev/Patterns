package creacionales.abstractfactory;
import creacionales.factory.Computadora;
public class ImplementaFabricaAbstracta {
    public static void main(String[] args) {
        implementaFabricaAbstracta();
    }

    private static void implementaFabricaAbstracta() {
        Computadora pc = FabricaComp.getComputer(new PCFabrica("2 GB",
                "500 GB","2.4 GHz"));
        Computadora server = FabricaComp.getComputer(new ServidorFabrica(
                "16 GB","1 TB","2.9 GHz"));
        System.out.println("Fabrica Abstracta PC Config::"+pc);
        System.out.println("Fabrica Abstracta Server Config::"+server);
    }
}
