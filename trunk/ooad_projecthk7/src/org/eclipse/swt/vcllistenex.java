package org.eclipse.swt;

import java.awt.EventQueue;

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
import javax.swing.JButton;

public class vcllistenex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vcllistenex window = new vcllistenex();
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
	public vcllistenex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 11, 650, 311);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOCABULARY");
		lblNewLabel.setBounds(10, 4, 640, 50);
		lblNewLabel.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\minilisten.png"));
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
		
		Button btnOpenfile = new Button("Open file");
		btnOpenfile.setForeground(new Color(0, 0, 255));
		btnOpenfile.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnOpenfile.setBounds(355, 190, 83, 44);
		panel_1.add(btnOpenfile);
		
		Button btnFinal = new Button("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnFinal.setBounds(537, 190, 83, 44);
		panel_1.add(btnFinal);
		
		JButton btnVclListen = new JButton("");
		btnVclListen.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\loa.png"));
		btnVclListen.setBounds(10, 195, 51, 38);
		panel_1.add(btnVclListen);
		
		JLabel lbltime = new JLabel("00:00");
		lbltime.setForeground(new Color(0, 0, 255));
		lbltime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		lbltime.setBounds(67, 196, 83, 38);
		panel_1.add(lbltime);
		
		JLabel lblSoLuongCau = new JLabel("1/40");
		lblSoLuongCau.setForeground(new Color(255, 0, 0));
		lblSoLuongCau.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuongCau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongCau.setBounds(167, 196, 83, 38);
		panel_1.add(lblSoLuongCau);
	}

}
