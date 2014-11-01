package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class readingmenu implements ActionListener {

	private static JDialog frame;
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
					readingmenu window = new readingmenu();
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
	public readingmenu() {
		initialize();	
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JDialog();
		frame.setBounds(100, 100, 597, 475);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("READING");
		lblNewLabel.setBounds(0, 0, 581, 31);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 37, 561, 392);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 10, 322, 371);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 302, 308);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(338, 10, 213, 215);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("00:00:00");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(342, 236, 209, 39);
		panel.add(lblNewLabel_1);
		
		btnopenfile = new JButton("Open file");
		btnopenfile.setForeground(new Color(0, 0, 255));
		btnopenfile.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnopenfile.setBounds(342, 286, 94, 52);
		btnopenfile.addActionListener(this);
		panel.add(btnopenfile);
		
		btnFinal = new JButton("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
		btnFinal.setBounds(462, 286, 89, 52);
		btnFinal.addActionListener(this);
		panel.add(btnFinal);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLUE);
		btnHome.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnHome.setBounds(342, 347, 209, 34);
		btnHome.addActionListener(this);
		panel.add(btnHome);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn==btnopenfile){
			System.out.println("Reading --> btnOpenfile_Click");
			openfileread open = new openfileread();
		}
		else if(btn==btnFinal){
			System.out.println("Listening --> btnFinal_Click");
			readingmask mask = new readingmask();
		}
		else if(btn==btnHome){
			System.out.println("Listening --> btnHome_Click");
			readingmenu.frame.setVisible(false);
			menu mask = new menu();
		}
	}
}
