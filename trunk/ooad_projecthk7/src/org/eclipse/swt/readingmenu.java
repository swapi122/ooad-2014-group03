package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.TextArea;
import javax.swing.JButton;

public class readingmenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					readingmenu window = new readingmenu();
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
	public readingmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("READING");
		lblNewLabel.setBounds(0, 0, 581, 31);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 37, 561, 349);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 10, 322, 328);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 302, 308);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(338, 10, 213, 215);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("00:00:00");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(342, 236, 209, 39);
		panel.add(lblNewLabel_1);
		
		JButton btnopenfile = new JButton("Open file");
		btnopenfile.setForeground(new Color(0, 0, 255));
		btnopenfile.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnopenfile.setBounds(342, 286, 89, 52);
		panel.add(btnopenfile);
		
		JButton btnFinal = new JButton("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		btnFinal.setBounds(462, 286, 89, 52);
		panel.add(btnFinal);
	}
}
