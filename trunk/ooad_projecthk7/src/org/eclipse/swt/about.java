package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class about {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about window = new about();
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
	public about() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 10, 462, 337);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\information.png"));
		lblNewLabel.setBounds(10, 10, 183, 266);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(199, 10, 253, 266);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("information");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 29, 233, 226);
		panel_1.add(lblNewLabel_1);
		
		JButton btnclose = new JButton("OK");
		btnclose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnclose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnclose.setForeground(new Color(220, 20, 60));
		btnclose.setBounds(363, 287, 89, 39);
		panel.add(btnclose);
	}

}
