package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class openfilelisten {

	private JFrame frmOpenFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					openfilelisten window = new openfilelisten();
					window.frmOpenFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public openfilelisten() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpenFile = new JFrame();
		frmOpenFile.setTitle("Open file");
		frmOpenFile.setBounds(100, 100, 568, 402);
		frmOpenFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOpenFile.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Open file");
		lblNewLabel.setBounds(10, 0, 532, 25);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmOpenFile.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 31, 532, 325);
		frmOpenFile.getContentPane().add(panel);
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEnabled(false);
		textArea.setBounds(10, 10, 512, 260);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 276, 512, 44);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btninputfile = new JButton("Input file");
		btninputfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btninputfile.setForeground(new Color(65, 105, 225));
		btninputfile.setBounds(10, 5, 97, 35);
		panel_1.add(btninputfile);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setForeground(new Color(65, 105, 225));
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOpen.setBounds(258, 5, 97, 35);
		panel_1.add(btnOpen);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(65, 105, 225));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(405, 5, 97, 35);
		panel_1.add(btnCancel);
	}
}
