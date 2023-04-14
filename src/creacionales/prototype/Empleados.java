package creacionales.prototype;

import java.util.ArrayList;
import java.util.List;

public class Empleados implements Cloneable{
    private List<String> empList;

    public Empleados(){
        empList = new ArrayList<String>();
    }

    public Empleados(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //se simula que se cargan entradas de una base de datos
        empList.add("Hugo");
        empList.add("Paco");
        empList.add("Luis");
        empList.add("Bryan");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Empleados(temp);
    }
}
