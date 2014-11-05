package presentation;
import readingFile.*;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;

public class openFileRead implements ActionListener {

	private static JFrame frame;
	JButton btnCancel;
	TextArea textArea;
	JButton btnOpen;
	JButton btninputfile;
	List menuList;
	String s="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					openFileRead window = new openFileRead();
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
	public openFileRead() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Open file");
		frame.setBounds(100, 100, 807, 402);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Open file");
		lblNewLabel.setBounds(10, 0, 532, 25);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel.setBounds(10, 31, 771, 325);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 276, 751, 44);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btninputfile = new JButton("Input file");
		btninputfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btninputfile.setForeground(new Color(65, 105, 225));
		btninputfile.setBounds(10, 5, 97, 35);
		btninputfile.addActionListener(this);
		panel_1.add(btninputfile);
		
		btnOpen = new JButton("Open");
		btnOpen.setForeground(new Color(65, 105, 225));
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOpen.setBounds(537, 5, 97, 35);
		btnOpen.addActionListener(this);
		panel_1.add(btnOpen);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(65, 105, 225));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(644, 5, 97, 35);
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		
		menuList = new List();
		menuList.setMultipleSelections(true);
		menuList.setMultipleMode(true);
		//menuList.setMultipleSelections(false);
		menuList.setBounds(10, 10, 128, 260);
		panel.add(menuList);
		
		textArea = new TextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setBounds(160, 10, 601, 260);
		textArea.setEditable(false);
		panel.add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton)e.getSource();
		
		inputFileReading inputfile = new inputFileReading();
		readFile read = new readFile();
		writeFile write = new writeFile();
		
		
		if(btn==btnCancel)
		{
			System.out.println("openfile --> btncncel_Click");
			openFileRead.frame.setVisible(false);
			//readingmenu read = new readingmenu();
			
		}
		
		else if(btn==btninputfile){
			System.out.println("openfile --> btninputfile_Click");
			
			try
			{
				inputfile.pickme();				
				write.writefile(inputfile.urlname);
				textArea.setText(read.docFile(inputfile.urlname));
				menuList.add(inputfile.name);
				//menuChoose.setName(inputfile.name);
				s=inputfile.urlname;
				
			}
			catch(Exception ex)
			{
				
			}
		}
		
		else if(btn==btnOpen){
			System.out.println("openfile --> btnopen_Click");
			openFileRead.frame.setVisible(false);
			
			menuReading reading = new menuReading();
			try
			{
				reading.textArea.setText(read.docFile(s));
			}catch(Exception ex){}
		}
	}
}
