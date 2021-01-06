import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaD {
	
	private Nodo raiz = null;
	private Nodo cola = null;
	
	public void Ejecutar() {
		 try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String linea;
				
				while(!(linea=br.readLine()).equals("0")) {
					String datos[] = linea.split(" ");
					Nodo nuevo = new Nodo(datos[0],datos[1],datos[2]);			
					if(this.raiz!=null) {
						nuevo.setSig(this.raiz);
						this.raiz.setAnt(nuevo);					
					}else {
						this.cola = nuevo;
					}
					this.raiz = nuevo;
				}
				Nodo actual=this.raiz;
				while(actual!=null){
		        System.out.println(actual.getP().getId() + actual.getP().getNombre() + actual.getP().getApellido());
			    actual= actual.getSig();
				}
				actual= this.cola;
				while(actual!=null){
			       // System.out.println(actual.getP().getId() + actual.getP().getNombre() + actual.getP().getApellido());
				    actual= actual.getAnt();
					}
				br.close();
			}catch(Exception e) {e.getStackTrace();}	
	}
	private class Nodo{
		private Nodo ant=null;
		private Nodo sig =null;
		private Persona p;
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

		public Persona getP() {
			return p;
		}

		public Nodo(String id ,String nombre , String apellido){
			
			this.p = new Persona(id,nombre,apellido);
		}
		
	}
	
	private class Persona{

		private String id;
		private String nombre;
		private String apellido;
	
		
		public String getId() {
			return id;
		}


		public String getNombre() {
			return nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public Persona(String id, String nombre, String apellido) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		}
			
	}
	
	public static void main(String[] args) throws IOException {
		ListaD lista= new ListaD();
		lista.Ejecutar();
		
}
		
	}

