package creacionales.prototype;

import java.util.List;

public class ImplementaPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Se crea la lista de empleados
        Empleados empleadosOriginal = new Empleados();

        // metodo que simula llamar a la base de datos
        empleadosOriginal.loadData();

        // Se clona la lista
        Empleados empleadosNueva = (Empleados) empleadosOriginal.clone();
        //segundo clon
        Empleados empleadosNuevaDos = (Empleados) empleadosOriginal.clone();

        List<String> listaUno = empleadosNueva.getEmpList();
        listaUno.add("Juan");
        List<String> ListaDos = empleadosNuevaDos.getEmpList();
        ListaDos.remove("Hugo");

        System.out.println("Lista Original: "+empleadosOriginal.getEmpList());
        System.out.println("Lista Clonada 1: "+listaUno);
        System.out.println("Lista Clonada 2: "+ListaDos);
    }
}
