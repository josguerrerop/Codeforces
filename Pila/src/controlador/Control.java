package controlador;

import logica.Pila;

public class Control {
	private Pila pila = new Pila();
	
	public Pila getPila() {
		return this.pila;
	}
	public void insertar(int id, String nombre, String apellido) {
		this.pila.insertar(id, nombre, apellido);
	}

}
