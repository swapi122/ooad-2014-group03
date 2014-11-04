package presentation;

import java.awt.EventQueue;

import javax.swing.JDialog;
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

public class menuListening implements ActionListener {

	private static JDialog frame;
	
	JButton btnlistien;
	JButton btnopenfile;
	JButton btnFinal;
	JButton btnHome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuListening window = new menuListening();
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
	public menuListening() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setResizable(false);
		frame.setBounds(100, 100, 581, 385);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(441, 53, 94, 33);
		panel.add(lblNewLabel_1);
		
		btnlistien = new JButton("");
		btnlistien.setToolTipText("click for listen/pause");
		btnlistien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlistien.setIcon(new ImageIcon("Images/loa.png"));
		btnlistien.setBounds(466, 93, 44, 42);
		btnlistien.addActionListener(this);
		panel.add(btnlistien);
		
		btnopenfile = new JButton("Open file");
		btnopenfile.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnopenfile.setForeground(new Color(65, 105, 225));
		btnopenfile.setBounds(441, 176, 94, 33);
		btnopenfile.addActionListener(this);
		panel.add(btnopenfile);
		
		btnFinal = new JButton("Final");
		btnFinal.setForeground(new Color(65, 105, 225));
		btnFinal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFinal.addActionListener(this);
		btnFinal.setBounds(441, 235, 94, 33);
		
		panel.add(btnFinal);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(new Color(65, 105, 225));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnHome.setBounds(441, 279, 94, 33);
		btnHome.addActionListener(this);
		panel.add(btnHome);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		
		if(btn==btnFinal){
			System.out.println("menu_listening --> btnFinal_Click");
			//menulistening.frame.setVisible(false);
			maskListening mask = new maskListening();
			
		}
		else if(btn==btnHome){
			System.out.println("menu_listening --> btnhome_Click");
			menuListening.frame.setVisible(false);
			menu home = new menu();
		}
		else if(btn==btnopenfile) {
			System.out.println("menu_listening --> btnopenfile_Click");
			//menulistening.frame.setVisible(false);
			openFileListen open = new openFileListen();
			//ListExerciseSpeaking listExerciseSpeaking = new ListExerciseSpeaking();
		}
		else if(btn==btnlistien) {
			System.out.println("menu_listening --> btnlisten_Click");
			//ListExerciseSpeaking listExerciseSpeaking = new ListExerciseSpeaking();
		}
	}
}
