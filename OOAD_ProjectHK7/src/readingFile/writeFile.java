package readingFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writeFile {

	//File write = new File("D:/LapTrinh/java/OOAD_ProjectHK7/data/read/listFileRead.txt");
	
	public void writefile(String s)
	{
		try {
	        //String data = "vo le hoang chung";
	        File file = new File("listFileRead.txt");
	        if (!file.exists()) {
	           file.createNewFile();
	        }
	        FileWriter fw = new FileWriter(file.getName(), true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pw = new PrintWriter(fw);
	        bw.write(s);
	        pw.println("\n");
	        bw.close();
	        System.out.println("Done");
	        } catch (Exception e) 
		{
	       e.printStackTrace();
	   }
	}
}
