package org.eclipse.swt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.TextField;
import javax.swing.JButton;

public class vclfillex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vclfillex window = new vclfillex();
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
	public vclfillex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 11, 625, 306);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOCABULARY");
		lblNewLabel.setBounds(1, 1, 547, 56);
		lblNewLabel.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\minifill.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(11, 63, 604, 186);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(10, 10, 584, 166);
		panel_1.add(textField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(10, 260, 200, 36);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblRequirement = new JLabel("requirement");
		lblRequirement.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequirement.setForeground(new Color(0, 0, 255));
		lblRequirement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRequirement.setBounds(10, 6, 180, 30);
		panel_2.add(lblRequirement);
		
		JButton btnFinal = new JButton("Final");
		btnFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFinal.setForeground(new Color(0, 0, 255));
		btnFinal.setBounds(220, 260, 89, 36);
		panel.add(btnFinal);
		
		JButton btnVcllsiten = new JButton("");
		btnVcllsiten.setIcon(new ImageIcon("D:\\HINH\\ICOn\\java\\loa.png"));
		btnVcllsiten.setBounds(318, 260, 45, 35);
		panel.add(btnVcllsiten);
		
		JLabel lblTime = new JLabel("00:00");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setForeground(new Color(0, 0, 255));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(370, 260, 71, 36);
		panel.add(lblTime);
		
		JLabel lblSoLuongCau = new JLabel("1/40");
		lblSoLuongCau.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuongCau.setForeground(Color.BLUE);
		lblSoLuongCau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongCau.setBounds(451, 260, 45, 36);
		panel.add(lblSoLuongCau);
		
		JButton btnOpenFile = new JButton("Open file");
		btnOpenFile.setForeground(Color.BLUE);
		btnOpenFile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOpenFile.setBounds(526, 260, 89, 36);
		panel.add(btnOpenFile);
	}
}
