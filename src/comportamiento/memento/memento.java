package comportamiento.memento;

import java.awt.List;
import java.util.ArrayList;

public class memento {

	public static void main(String[] args) {

		
		Editor a = new Editor();
		a.escribir("pedro");
		System.out.println(a.getContenido());
		
		EditorMemento memento1 = a.guardar();
		a.escribir("pepe");
		System.out.println(a.getContenido());
		
		a.restaurar(memento1);
		System.out.println(a.getContenido());
		

	}

}
//Clase Memento que almacena el estado del editor
class EditorMemento {
 private final String contenido;

 public EditorMemento(String contenido) {
     this.contenido = contenido;
 }

 public String getContenido() {
     return contenido;
 }
}

//Clase Editor que tiene un campo contenido que representa el texto actual
class Editor {
 private String contenido;

 public Editor() {
     this.contenido = "";
 }

 public void escribir(String texto) {
     contenido = texto;
 }

 // Crea un memento con el estado actual del editor
 public EditorMemento guardar() {
     return new EditorMemento(contenido);
 }

 // Restaura el estado del editor a partir de un memento
 public void restaurar(EditorMemento memento) {
     contenido = memento.getContenido();
 }

 public String getContenido() {
     return contenido;
 }
}

//Clase Caretaker que mantiene una lista de mementos del editor
class Historial {
 private final ArrayList<EditorMemento> mementos = new ArrayList<>();
 private int indiceActual = -1;

 public void agregar(EditorMemento memento) {
     mementos.add(memento);
     indiceActual = mementos.size() - 1;
 }

 // Obtiene el memento m�s reciente y lo elimina de la lista
 public EditorMemento deshacer() {
     if (indiceActual <= 0) {
         return null;
     }
     indiceActual--;
     EditorMemento memento = mementos.get(indiceActual);
     mementos.remove(memento);
     return memento;
 }

 // Obtiene el siguiente memento y lo elimina de la lista
 public EditorMemento rehacer() {
     if (indiceActual >= mementos.size() - 1) {
         return null;
     }
     indiceActual++;
     EditorMemento memento = mementos.get(indiceActual);
     mementos.remove(memento);
     return memento;
 }
}

