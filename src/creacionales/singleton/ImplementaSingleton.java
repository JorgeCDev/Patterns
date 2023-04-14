package creacionales.singleton;

public class ImplementaSingleton {
    public static void main(String[] args) {
        System.out.println("Sí se imprime el mismo valor es que solo existe " +
                "un singleton" + "\n" +
                "Sí se ven valores diferentes es que se crearon dos " +
                "instancias diferentes del singleton" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("Juan");
        Singleton segundoSingleton = Singleton.getInstance("Pedro");
        System.out.println(singleton.value);
        System.out.println(segundoSingleton.value);
    }
}
