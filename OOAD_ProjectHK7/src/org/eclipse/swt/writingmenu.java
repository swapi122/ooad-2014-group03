package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class writingmenu implements ActionListener {

	private static JDialog frame;
	JButton btnOpenfile;
	JButton btnFinal;
	JButton btnHome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					writingmenu window = new writingmenu();
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
	public writingmenu() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setBounds(100, 100, 728, 427);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 11, 692, 371);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WRITING");
		lblNewLabel.setBounds(1, 1, 615, 31);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(11, 43, 308, 268);
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPicture = new JLabel("this is a picture");
		lblPicture.setForeground(new Color(0, 0, 255));
		lblPicture.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setBounds(10, 11, 288, 246);
		panel_1.add(lblPicture);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(325, 44, 357, 267);
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Dialog", Font.PLAIN, 16));
		textArea.setBackground(new Color(248, 248, 255));
		textArea.setForeground(new Color(0, 0, 255));
		textArea.setText("text.........");
		textArea.setBounds(10, 10, 337, 247);
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(10, 317, 309, 50);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblRequired = new JLabel("this is a required");
		lblRequired.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRequired.setForeground(new Color(0, 0, 255));
		lblRequired.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequired.setBounds(0, 0, 309, 50);
		panel_3.add(lblRequired);
		
		JLabel lblTime = new JLabel("00:00");
		lblTime.setBackground(new Color(240, 255, 255));
		lblTime.setForeground(new Color(0, 0, 255));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTime.setBounds(325, 317, 89, 50);
		panel.add(lblTime);
		
		btnOpenfile = new JButton("Open file");
		btnOpenfile.setForeground(new Color(0, 0, 255));
		btnOpenfile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOpenfile.setBounds(423, 317, 94, 50);
		btnOpenfile.addActionListener(this);
		panel.add(btnOpenfile);
		
		btnFinal = new JButton("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFinal.setBounds(527, 317, 89, 50);
		btnFinal.addActionListener(this);
		panel.add(btnFinal);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLUE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnHome.setBounds(621, 317, 61, 50);
		btnHome.addActionListener(this);
		panel.add(btnHome);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn==btnOpenfile)
		{
			System.out.println("writing --> btnopenfile_Click");
			
			openfilewriting ope = new openfilewriting();
			//vclfillex vocabulary_fill = new vclfillex();
		}
		else if(btn==btnFinal){
			System.out.println("writing --> btnfinal_Click");
			
			writingmask lis = new writingmask();
			//vcllistenex vocabulary_listen = new vcllistenex();
		}
		else if(btn==btnHome){
			System.out.println("writing --> btnHome_Click");
			writingmenu.frame.setVisible(false);
			menu home = new menu();
			//vcllistenex vocabulary_listen = new vcllistenex();
		}
		
		
		
	}

}
