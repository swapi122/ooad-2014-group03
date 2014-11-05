package presentation;

import java.awt.EventQueue;

import javax.swing.JDialog;
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
import java.awt.SystemColor;

public class menu implements ActionListener {
	
	JButton btnListening;
	JButton btnReading;
	JButton btnWriting;
	JButton btnSpeaking;
	JButton btnVocabulary;
	JButton btnHelp;
	

	private static JFrame frame;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
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
	public menu() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 731, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(10, 11, 695, 418);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnListening = new JButton("Listening");
		btnListening.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnListening.setForeground(new Color(51, 51, 153));
		btnListening.setBounds(23, 22, 151, 46);
		btnListening.addActionListener(this);
		panel.add(btnListening);
		
		btnSpeaking = new JButton("Speaking");
		btnSpeaking.setForeground(new Color(51, 51, 153));
		btnSpeaking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSpeaking.setBounds(23, 85, 151, 46);
		btnSpeaking.addActionListener(this);
		panel.add(btnSpeaking);
		//btnSpeaking.addActionListener(this);
		
		btnReading = new JButton("Reading");
		btnReading.setForeground(new Color(51, 51, 153));
		btnReading.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReading.setBounds(23, 155, 151, 46);
		btnReading.addActionListener(this);
		panel.add(btnReading);
		
		btnWriting = new JButton("Writing");
		btnWriting.setForeground(new Color(51, 51, 153));
		btnWriting.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWriting.setBounds(23, 225, 151, 46);
		btnWriting.addActionListener(this);
		panel.add(btnWriting);
		
		btnVocabulary = new JButton("Vocabulary");
		//btnVocabulary.setIcon(new ImageIcon("Images/smallvcl.png"));
		btnVocabulary.setForeground(new Color(51, 51, 153));
		btnVocabulary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVocabulary.setBounds(23, 295, 151, 46);
		btnVocabulary.addActionListener(this);
		panel.add(btnVocabulary);
		
		btnHelp = new JButton("Help");
		btnHelp.setBackground(SystemColor.activeCaption);
		btnHelp.setToolTipText("help");
		btnHelp.setIcon(new ImageIcon("Images/help.png"));
		btnHelp.setForeground(new Color(51, 51, 153));
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHelp.setBounds(23, 361, 151, 46);
		btnHelp.addActionListener(this);
		panel.add(btnHelp);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(191, 22, 494, 321);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Images/hinhnen.png"));
		lblNewLabel.setBounds(10, 10, 474, 300);
		panel_1.add(lblNewLabel);
		
		JLabel lblPhanMemHo = new JLabel(" \u00A9 Phan mem ho tro IELTS");
		lblPhanMemHo.setBackground(new Color(255, 255, 255));
		lblPhanMemHo.setIcon(new ImageIcon("Images/Untitled.png"));
		lblPhanMemHo.setForeground(new Color(46, 139, 87));
		lblPhanMemHo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhanMemHo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhanMemHo.setBounds(193, 363, 489, 44);
		panel.add(lblPhanMemHo);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton)e.getSource();
		
		if(btn==btnListening){
			System.out.println("Home --> Listening_Click");
			menu.frame.setVisible(false);
			menuListening listExerciseListening = new menuListening();
			
		}
		else if(btn==btnReading){
			System.out.println("Home --> reading_Click");
			menu.frame.setVisible(false);
			menuReading reading = new menuReading();
		}
		else if(btn==btnSpeaking) {
			System.out.println("Home --> speaking_Click");
			menu.frame.setVisible(false);
			menuSpeaking speaking = new menuSpeaking();
		}
		else if(btn==btnVocabulary){
			System.out.println("Home --> vocabulary_Click");
			menu.frame.setVisible(false);
			menuVocabulary vocabu =new menuVocabulary();
		}
		else if(btn==btnWriting){
			System.out.println("Home --> writing_Click");
			menu.frame.setVisible(false);
			menuWriting wrinting =new menuWriting();
		}
		else if(btn==btnHelp){
			System.out.println("Home --> help_Click");
			about help =new about();
		}	
	}
}
