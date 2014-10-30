package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class munechinh {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					munechinh window = new munechinh();
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
	public munechinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(10, 11, 695, 418);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnlisten = new JButton("Listening");
		btnlisten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("menuchinh --> listening button clicked");
			}
		});
		btnlisten.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnlisten.setForeground(new Color(51, 51, 153));
		btnlisten.setBounds(23, 22, 151, 46);
		panel.add(btnlisten);
		
		JButton btnSpeaking = new JButton("Speaking");
		btnSpeaking.setForeground(new Color(51, 51, 153));
		btnSpeaking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSpeaking.setBounds(23, 85, 151, 46);
		panel.add(btnSpeaking);
		
		JButton btnReading = new JButton("Reading");
		btnReading.setForeground(new Color(51, 51, 153));
		btnReading.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReading.setBounds(23, 155, 151, 46);
		panel.add(btnReading);
		
		JButton btnWriting = new JButton("Writing");
		btnWriting.setForeground(new Color(51, 51, 153));
		btnWriting.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWriting.setBounds(23, 225, 151, 46);
		panel.add(btnWriting);
		
		JButton btnVocabulary = new JButton("Vocabulary");
		btnVocabulary.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\smallvcl.png"));
		btnVocabulary.setForeground(new Color(51, 51, 153));
		btnVocabulary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVocabulary.setBounds(23, 295, 151, 46);
		panel.add(btnVocabulary);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setToolTipText("help");
		btnHelp.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\help.png"));
		btnHelp.setForeground(new Color(51, 51, 153));
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHelp.setBounds(23, 361, 151, 46);
		panel.add(btnHelp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(191, 22, 494, 321);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\hinhnen.png"));
		lblNewLabel.setBounds(10, 10, 474, 300);
		panel_1.add(lblNewLabel);
		
		JLabel lblPhanMemHo = new JLabel(" \u00A9 Phan mem ho tro IELTS");
		lblPhanMemHo.setBackground(new Color(255, 255, 255));
		lblPhanMemHo.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\Untitled.png"));
		lblPhanMemHo.setForeground(new Color(46, 139, 87));
		lblPhanMemHo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhanMemHo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhanMemHo.setBounds(193, 363, 489, 44);
		panel.add(lblPhanMemHo);
	}
}
