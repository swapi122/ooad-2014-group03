package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menulistening {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menulistening window = new menulistening();
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
	public menulistening() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 10, 545, 334);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LISTENING");
		lblNewLabel.setBackground(new Color(220, 220, 220));
		lblNewLabel.setBounds(0, 0, 545, 46);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 38));
		panel.add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setEnabled(false);
		textArea.setForeground(new Color(0, 0, 255));
		textArea.setBounds(10, 52, 425, 260);
		panel.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("00:00");
		lblNewLabel_1.setBackground(new Color(245, 245, 245));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(51, 102, 204));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(453, 56, 82, 33);
		panel.add(lblNewLabel_1);
		
		JButton btnlistien = new JButton("");
		btnlistien.setToolTipText("click for listen/pause");
		btnlistien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlistien.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\loa.png"));
		btnlistien.setBounds(463, 100, 50, 46);
		panel.add(btnlistien);
		
		JButton btnopenfile = new JButton("Open file");
		btnopenfile.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnopenfile.setForeground(new Color(65, 105, 225));
		btnopenfile.setBounds(441, 176, 94, 33);
		panel.add(btnopenfile);
		
		JButton btnFinal = new JButton("Final");
		btnFinal.setForeground(new Color(65, 105, 225));
		btnFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFinal.setBounds(441, 235, 94, 33);
		panel.add(btnFinal);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(new Color(65, 105, 225));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHome.setBounds(441, 279, 94, 33);
		panel.add(btnHome);
	}
}
