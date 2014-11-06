package timeRead;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


public class View extends JPanel implements Observer {
	static Color color = Color.GREEN;
	Model model;
	Model model1;
	View(Model model) {
		this.model = model;
		//this.model1 = model1;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(color);
		//g.fillOval(model.getX(), model.getY(),
				//model.BALL_SIZE, model.BALL_SIZE);
		//g.fillOval(model1.getX()+30, model1.getY()+10,model1.BALL_SIZE, model1.BALL_SIZE);
	}
	
	public void update(Observable obs, Object arg) {
		
        repaint();
    }


}
