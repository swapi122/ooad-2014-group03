package readingFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class readFile {
	
	public String docFile( String s )  throws Exception
	{
		inputFileReading input = new inputFileReading(); 
		//read file
		String text ="";
		try
		{
			FileReader file = new FileReader(s);
			BufferedReader reader = new BufferedReader(file);
			
			String line = reader.readLine();
			while(line !=null)
			{
				text += line + "\n";
				line = reader.readLine();
			}
			//System.out.println(text);
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Error");
		}
	
		
	
		return text;
	
	}
}
