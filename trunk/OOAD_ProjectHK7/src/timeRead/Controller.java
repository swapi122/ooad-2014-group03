package timeRead;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Controller extends JFrame {

	JPanel buttonPanel = new JPanel();
	JPanel panel = new JPanel();
	JLabel lblTitle = new JLabel(" ");
	JButton runButton = new JButton("Run");
	JButton stopButton = new JButton("Stop");
	Timer timer;
	//boolean flag = true; ko can nua
	Model model = new Model();
	// Model model1 = new Model();

	View view = new View(model); // View must know about Model

	public void init() {
		layOutComponents();
		attachListenersToComponents();
		// Connect model and view
		model.addObserver(view);
	}

	private void layOutComponents() {
		setLayout(new BorderLayout());
		lblTitle.setAlignmentX(CENTER_ALIGNMENT);
		this.add(BorderLayout.SOUTH, panel);
		this.add(BorderLayout.NORTH, buttonPanel);
		buttonPanel.add(runButton);
		buttonPanel.add(stopButton);
		stopButton.setEnabled(false);
		this.add(BorderLayout.CENTER, view);
		
		panel.add(BorderLayout.SOUTH, lblTitle);
		
	}

	private void attachListenersToComponents() {
		runButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				runButton.setEnabled(false);
				stopButton.setEnabled(true);
				timer = new Timer(true);
				timer.schedule(new Strobe(), 0, 1000);
				//timer.schedule(new Strobe1(), 0, 300);
				// 25 times a second
			}
		});
		stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				runButton.setEnabled(true);
				stopButton.setEnabled(false);
				timer.cancel();
			}

		});
	}

	// @Override
	private class Strobe extends TimerTask {

		public void run() {

			model.setLimits(view.getWidth(), view.getHeight());
			model.makeOneStep();
			lblTitle.setText(model.s);
		}
	}
	public static void main(String[] args) {
		Controller controllerApp = new Controller();
		controllerApp.init();
		controllerApp.setSize(300, 300);
		controllerApp.setVisible(true);
		controllerApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
