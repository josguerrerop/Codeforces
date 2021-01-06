package presentacion;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controlador.Control;
public class PFormulario extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel lId;
	private JLabel lNombre;
	private JLabel lApellido;
	private JTextField tId;
	private JTextField tNombre;
	private JTextField tApellido;
	private JButton bInsertar;
	private Control control;
	
	public Control getControl() {
		return this.control;
	}
	public PFormulario() {
		this.setLayout(new GridLayout(4,2));
		this.control = new Control();
		this.lId = new JLabel("Id");
		this.lNombre = new JLabel("Nombre");
		this.lApellido = new JLabel("Apellido");
		this.tId = new JTextField();
		this.tNombre = new JTextField();
		this.tApellido = new JTextField();
		this.bInsertar = new JButton("Insertar");
		this.bInsertar.addActionListener(this);
		this.add(this.lId);
		this.add(this.tId);
		this.add(this.lNombre);
		this.add(this.tNombre);
		this.add(this.lApellido);
		this.add(this.tApellido);
		this.add(this.bInsertar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.bInsertar) {			
			this.control.insertar(Integer.parseInt(this.tId.getText()), this.tNombre.getText(), this.tApellido.getText());			
		}
		
	}

}
