package logica;

import java.util.ArrayList;
import java.util.Observable;

public class Pila extends Observable{
	private Nodo raiz = null;
	
	public void insertar(int id, String nombre, String apellido) {
		Persona persona = new Persona(id, nombre, apellido);
		Nodo nuevoNodo = new Nodo(persona);		
		if(this.raiz != null) {
			this.raiz.setAnt(nuevoNodo);
			nuevoNodo.setSig(this.raiz);
		}
		this.raiz = nuevoNodo;
		this.crearListaId();
	}

	
	@SuppressWarnings("deprecation")
	private void crearListaId() {
		ArrayList<Integer> ids = new ArrayList<Integer>();		
		Nodo temp = this.raiz;
		while(temp != null){
			ids.add(new Integer(temp.getPersona().getId()));
			temp = temp.getSig();
		}		
		this.setChanged();
		this.notifyObservers(ids);		
	}
}
