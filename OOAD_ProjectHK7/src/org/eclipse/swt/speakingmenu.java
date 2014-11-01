package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JDialog;
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




public class speakingmenu implements ActionListener {

	private static JDialog frame;
	
	JButton btnFinal;
	JButton btnSkip;
	JButton btnOpenFile;
	JButton btnspeaking;
	JButton btnHome;
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
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setBounds(100, 100, 637, 396);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		btnSkip = new JButton("Skip");
		btnSkip.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnSkip.setForeground(new Color(0, 0, 255));
		btnSkip.setBounds(496, 169, 95, 31);
		btnSkip.addActionListener(this);
		panel.add(btnSkip);
		
		btnFinal = new JButton("Final");	
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnFinal.setBounds(496, 211, 95, 31);
		btnFinal.addActionListener(this);
		//frame.getContentPane().add(btnFinal);
		
		panel.add(btnFinal);
		
		btnOpenFile = new JButton("open file");
		btnOpenFile.setForeground(Color.BLUE);
		btnOpenFile.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btnOpenFile.setBounds(496, 253, 95, 31);
		btnOpenFile.addActionListener(this);
		panel.add(btnOpenFile);
		
		JLabel lblNewLabel_2 = new JLabel("1/40");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBounds(496, 78, 95, 31);
		panel.add(lblNewLabel_2);
		
		btnspeaking = new JButton("");
		btnspeaking.setIcon(new ImageIcon("Images/loa.png"));
		btnspeaking.setForeground(Color.BLUE);
		btnspeaking.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnspeaking.setBounds(519, 112, 54, 46);
		btnspeaking.addActionListener(this);
		panel.add(btnspeaking);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLUE);
		btnHome.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		btnHome.setBounds(496, 298, 95, 31);
		btnHome.addActionListener(this);
		panel.add(btnHome);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton btn = (JButton)e.getSource();
		
		if(btn==btnFinal){
			System.out.println("speakingmenu --> btnFinal_Click");
			//speakingmenu.frame.setVisible(false);
			speakingmask mask = new speakingmask();
			
		}
		if(btn==btnSkip){
			System.out.println("speakingmenu --> btnSkip_Click");
			//speakingmenu.frame.setVisible(true);
			//listenmask listExerciseListening = new listenmask();
			
		}
		if(btn==btnOpenFile){
			System.out.println("speakingmenu --> btnOpenfile_Click");
			//speakingmenu.frame.setVisible(true);
			openfilespeak open = new openfilespeak();
			//listenmask listExerciseListening = new listenmask();
			
		}
		if(btn==btnspeaking){
			System.out.println("speakingmenu --> btnSpeak_Click");
			//speakingmenu.frame.setVisible(true);
			//listenmask listExerciseListening = new listenmask();
			
		}
		if(btn==btnHome){
			System.out.println("speakingmenu --> btnHome_Click");
			speakingmenu.frame.setVisible(false);
			menu home = new menu();
			//listenmask listExerciseListening = new listenmask();
			
		}
	}
}
