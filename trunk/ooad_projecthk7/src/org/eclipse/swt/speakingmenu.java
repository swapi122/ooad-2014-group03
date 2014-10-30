package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class speakingmenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					speakingmenu window = new speakingmenu();
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
	public speakingmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 10, 601, 340);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPEAKING");
		lblNewLabel.setBounds(1, 1, 599, 31);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(11, 38, 475, 291);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("00:00");
		lblNewLabel_1.setToolTipText("time");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(496, 45, 95, 38);
		panel.add(lblNewLabel_1);
		
		JButton btnSkip = new JButton("Skip");
		btnSkip.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnSkip.setForeground(new Color(0, 0, 255));
		btnSkip.setBounds(496, 169, 95, 46);
		panel.add(btnSkip);
		
		JButton btnFinal = new JButton("Final");
		btnFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnFinal.setBounds(496, 226, 95, 46);
		panel.add(btnFinal);
		
		JButton btnOpenFile = new JButton("open file");
		btnOpenFile.setForeground(Color.BLUE);
		btnOpenFile.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btnOpenFile.setBounds(496, 283, 95, 46);
		panel.add(btnOpenFile);
		
		JLabel lblNewLabel_2 = new JLabel("1/40");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBounds(496, 78, 95, 31);
		panel.add(lblNewLabel_2);
		
		JButton btnspeaking = new JButton("");
		btnspeaking.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\loa.png"));
		btnspeaking.setForeground(Color.BLUE);
		btnspeaking.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnspeaking.setBounds(519, 112, 54, 46);
		panel.add(btnspeaking);
	}

}
