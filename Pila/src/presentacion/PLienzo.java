package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

@SuppressWarnings("deprecation")
public class PLienzo extends JPanel implements Observer{
	private static final long serialVersionUID = 1L;
	ArrayList<Integer> ids = new ArrayList<Integer>();
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.BLUE);
		
		for(int i=0; i<this.ids.size(); i++) {
			System.out.println(i+1);
			g.drawRect(30+ i*120, 30, 90, 30);
			g.drawLine(60 + i*120, 30, 60 + i*120, 60);
			g.drawLine(90 + i*120, 30, 90 + i*120, 60);
			g.drawString(ids.get(i).toString(), 70 + i*120, 50);
			if(this.ids.size()>(i+1)) {
			//	System.out.println(this.ids.size() + " " + (i+1));
				g.drawLine((i+1)*120, 40, (i+1)*120 + 30, 40);
				g.drawLine((i+1)*120, 50, (i+1)*120 + 30, 50);
				g.drawString(">", (i+1)*120 + 22, 45);
				g.drawString("<", (i+1)*120, 55);				
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(Observable arg0, Object arg1) {
		this.ids = (ArrayList<Integer>) arg1;
		this.repaint();
	}

}
