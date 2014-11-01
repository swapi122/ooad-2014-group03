package presentation;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class vclpronunciationex implements ActionListener {

	private static JFrame frame;
	private JTextField txtAnswer;
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
					vclpronunciationex window = new vclpronunciationex();
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
	public vclpronunciationex() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 703, 361);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 667, 305);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOCABULARY");
		lblNewLabel.setBounds(0, 0, 585, 43);
		lblNewLabel.setIcon(new ImageIcon("Images/pronunciation.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 49, 325, 206);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblWord = new JLabel("a Word");
		lblWord.setHorizontalAlignment(SwingConstants.CENTER);
		lblWord.setForeground(new Color(0, 0, 255));
		lblWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWord.setBounds(10, 10, 305, 185);
		panel_1.add(lblWord);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_2.setBounds(341, 49, 316, 206);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(10, 11, 296, 61);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		txtAnswer = new JTextField();
		txtAnswer.setForeground(new Color(0, 0, 255));
		txtAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnswer.setText("answer");
		txtAnswer.setBounds(10, 11, 276, 39);
		panel_3.add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 77, 296, 118);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPronunTable = new JLabel("pronun table");
		lblPronunTable.setForeground(new Color(0, 0, 255));
		lblPronunTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPronunTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblPronunTable.setBounds(10, 31, 200, 50);
		panel_4.add(lblPronunTable);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 266, 325, 28);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblRequired = new JLabel("required");
		lblRequired.setForeground(new Color(0, 0, 255));
		lblRequired.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequired.setBounds(0, 0, 315, 28);
		panel_5.add(lblRequired);
		
		btnOpenfile = new JButton("open file");
		btnOpenfile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOpenfile.setForeground(new Color(0, 0, 255));
		btnOpenfile.setBounds(341, 258, 89, 36);
		btnOpenfile.addActionListener(this);
		panel.add(btnOpenfile);
		
		JLabel lblTime = new JLabel("00:00");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setForeground(new Color(0, 0, 255));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(436, 261, 59, 33);
		panel.add(lblTime);
		
		JLabel lblSoLuongCau = new JLabel("1/40");
		lblSoLuongCau.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuongCau.setForeground(new Color(255, 0, 0));
		lblSoLuongCau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuongCau.setBounds(497, 260, 46, 33);
		panel.add(lblSoLuongCau);
		
		btnFinal = new JButton("Final");
		btnFinal.setForeground(Color.BLUE);
		btnFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFinal.setBounds(568, 258, 89, 36);
		btnFinal.addActionListener(this);
		panel.add(btnFinal);
		
		btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLUE);
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBounds(568, 7, 89, 36);
		btnHome.addActionListener(this);
		panel.add(btnHome);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		if(btn==btnFinal)
		{
			System.out.println("ExerciseVocabulary_pronun --> btnFinal_Click");
			vclpronunmask mask = new vclpronunmask();
		}
		else if(btn == btnOpenfile){
			System.out.println("ExerciseVocabulary_Pronun --> btnOpenFile_Click");
			//Vocabulary vocabulary = new Vocabulary();
		}
		else if(btn == btnHome){
			System.out.println("ExerciseVocabulary_Pronun --> btnOpenFile_Click");
			vclpronunciationex.frame.setVisible(false);
			vocabularymenu vcl = new vocabularymenu();
			//Vocabulary vocabulary = new Vocabulary();
		}

		
	}
}
