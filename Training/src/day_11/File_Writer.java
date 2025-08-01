package day_11;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String content = "This is a file writer ";
		 
			FileWriter fw = new FileWriter("C:\\Users\\gagan\\OneDrive\\Documents\\Gm.txt"); 
		
		fw.write(content);
		
		System.out.println("Content added");	
	
	}
		
}
	

