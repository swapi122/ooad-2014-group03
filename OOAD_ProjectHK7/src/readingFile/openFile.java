/*package readingFile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import presentation.openFileWriting;
import java.awt.Choice;
import java.awt.TextArea;

public class openFile implements ActionListener {

	
	JButton btnOpen;
	TextArea textArea;
	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					openFile window = new openFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
/*
	public openFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
/*
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnOpen = new JButton("Open");
		btnOpen.setBounds(157, 215, 99, 39);
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(btnOpen);
		
		textArea = new TextArea();
		textArea.setEnabled(false);
		textArea.setBounds(75, 23, 349, 170);
		frame.getContentPane().add(textArea);
		btnOpen.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn==btnOpen)
		{
			inputFileReading op = new inputFileReading();
			readFile rf = new readFile();
			try
			{
				op.pickme();
				//textArea.setText(rf.docFile(op.filename));
			}
			catch( Exception E)
			
			{
				E.printStackTrace();
			}
			//vclfillex vocabulary_fill = new vclfillex();
		}
	}
}
*/