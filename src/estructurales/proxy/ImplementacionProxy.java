package estructurales.proxy;
//actua como un intermediario para que un objeto tengo acceso
public class ImplementacionProxy {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Jorge",
                "pwd_incorrecto");
        try {
            executor.runCommand("cmd dir");
            executor.runCommand("del");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
