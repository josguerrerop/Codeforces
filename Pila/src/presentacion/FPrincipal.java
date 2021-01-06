package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PFormulario pFormulario;
	private PLienzo pLienzo;
	
	@SuppressWarnings("deprecation")
	private void init() {
		this.pFormulario = new PFormulario();		
		this.pLienzo = new PLienzo();
		this.setSize(800,600);
		this.setTitle("Pila MVC de verdad");
		this.setLayout(new BorderLayout());
		this.add(this.pFormulario, BorderLayout.WEST);
		this.add(this.pLienzo, BorderLayout.CENTER);
		this.pFormulario.getControl().getPila().addObserver(this.pLienzo);
	}

	public static void main(String[] args) {
		FPrincipal principal = new FPrincipal();
		principal.init();
		principal.setVisible(true);
	}

	
}
