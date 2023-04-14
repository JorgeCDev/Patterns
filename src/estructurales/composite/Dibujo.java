package estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class Dibujo implements Figura{
    private List<Figura> shapes = new ArrayList<Figura>();

    @Override
    public void dibujar(String fillColor) {
        for(Figura sh : shapes)
        {
            sh.dibujar(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Figura s){
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Figura s){
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear(){
        System.out.println("Se limpian todas las figuras del dibujo");
        this.shapes.clear();
    }
}
