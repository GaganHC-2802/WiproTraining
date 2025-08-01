package day_11;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\gagan\\OneDrive\\Documents\\Gm.txt");
		int ch;
		while((ch = fr.read())!= -1) {
			System.out.println((char)ch);
		}
	}
}
