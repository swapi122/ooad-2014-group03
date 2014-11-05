package readingFile;

import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class inputFileReading {

	
	JFileChooser filechoose = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	public String name ="";
	public String urlname ="";
	public void pickme() throws Exception {
		if(filechoose.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
		{
			//get file
			
		
			//FileReader filereader = new FileReader(s);
			java.io.File file = filechoose.getSelectedFile();
			urlname = file.getAbsolutePath();
			name = file.getName();
			
			Scanner input = new Scanner(file);
			
			
			while(input.hasNext())
			{
				
				sb.append(input.nextLine());
				sb.append("/n");
			}
			input.close();
		}
		else
		{
			sb.append("no file select");
		}
	}
}


