package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class vocabularymenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vocabularymenu window = new vocabularymenu();
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
	public vocabularymenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 10, 722, 330);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOCABULARY");
		lblNewLabel.setBounds(1, 1, 559, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(11, 38, 701, 281);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(10, 10, 216, 260);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\listen.png"));
		lblNewLabel_1.setBounds(10, 10, 200, 198);
		panel_2.add(lblNewLabel_1);
		
		JButton btnListenOpen = new JButton("Open");
		btnListenOpen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnListenOpen.setForeground(new Color(0, 0, 255));
		btnListenOpen.setBounds(10, 208, 200, 41);
		panel_2.add(btnListenOpen);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(242, 10, 216, 260);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\phatam.png"));
		label.setBounds(10, 10, 200, 198);
		panel_3.add(label);
		
		JButton btnPronunOpen = new JButton("Open");
		btnPronunOpen.setForeground(Color.BLUE);
		btnPronunOpen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPronunOpen.setBounds(10, 208, 200, 41);
		panel_3.add(btnPronunOpen);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_4.setBounds(475, 10, 216, 260);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\dientu.png"));
		label_1.setBounds(10, 10, 200, 198);
		panel_4.add(label_1);
		
		JButton btnFillOpen = new JButton("Open");
		btnFillOpen.setForeground(Color.BLUE);
		btnFillOpen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnFillOpen.setBounds(10, 208, 200, 41);
		panel_4.add(btnFillOpen);
	}

}
