package presentation;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ExVclListen implements ActionListener {

	private static JFrame frame;
	JButton btnOpenfile;
	JButton btnFinal;
	JButton btnVclListen;
	JButton btnHome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExVclListen window = new ExVclListen();
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
	public ExVclListen() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 366);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 11, 650, 311);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOCABULARY");
		lblNewLabel.setBounds(0, 0, 640, 50);
		lblNewLabel.setIcon(new ImageIcon("Images/minilisten.png"));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 56, 630, 244);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(10, 10, 339, 174);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("requirement");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(10, 10, 319, 153);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(355, 10, 265, 174);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("exercise");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_2.setBounds(10, 10, 245, 153);
		panel_3.add(lblNewLabel_2);
		
		btnOpenfile = new JButton("Open file");
		btnOpenfile.setForeground(new Color(0, 0, 255));
		btnOpenfile.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnOpenfile.setBounds(247, 190, 96, 44);
		btnOpenfile.addActionListener(this);
		panel_1.add(btnOpenfile);
		
		btnFinal = new JButton("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFinal.setBounds(355, 190, 83, 44);
		btnFinal.addActionListener(this);
		panel_1.add(btnFinal);
		
		btnVclListen = new JButton("");
		btnVclListen.setIcon(new ImageIcon("Images/loa.png"));
		btnVclListen.setBounds(86, 195, 40, 38);
		btnVclListen.addActionListener(this);
		panel_1.add(btnVclListen);
		
		JLabel lbltime = new JLabel("00:00");
		lbltime.setForeground(new Color(0, 0, 255));
		lbltime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		lbltime.setBounds(10, 193, 83, 38);
		panel_1.add(lbltime);
		
		JLabel lblSoLuongCau = new JLabel("1/40");
		lblSoLuongCau.setForeground(new Color(255, 0, 0));
		lblSoLuongCau.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuongCau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongCau.setBounds(147, 196, 83, 38);
		panel_1.add(lblSoLuongCau);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLUE);
		btnHome.setFont(new Font("Dialog", Font.PLAIN, 13));
		btnHome.setBounds(554, 190, 66, 44);
		btnHome.addActionListener(this);
		panel_1.add(btnHome);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn==btnVclListen)
		{
			System.out.println("ExerciseVocabulary_listen --> btnlisten_Click");
		}
		else if(btn == btnFinal){
			System.out.println("ExerciseVocabulary_listen --> btnfinal_Click");
			//Vocabulary vocabulary = new Vocabulary();
		}
		else if(btn == btnOpenfile){
			System.out.println("ExerciseVocabulary_listen --> btnOpen_Click");
			//Vocabulary vocabulary = new Vocabulary();
		}
		else if(btn == btnHome){
			System.out.println("ExerciseVocabulary_listen --> btnHome_Click");
			ExVclListen.frame.setVisible(false);
			menuVocabulary vcl = new menuVocabulary();
			
			//Vocabulary vocabulary = new Vocabulary();
		}
	}

}
