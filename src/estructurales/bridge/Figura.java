package estructurales.bridge;

public abstract class Figura {
    //Composition - implementador
    protected Color color;

    //constructor con implementador como argumento
    public Figura(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}
