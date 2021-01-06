package logica;

public class Nodo {
	
	private Persona persona;
	private Nodo ant = null;
	private Nodo sig = null;
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Nodo getAnt() {
		return ant;
	}

	public void setAnt(Nodo ant) {
		this.ant = ant;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public Nodo(Persona persona) {
		this.persona = persona;
	}	
}
