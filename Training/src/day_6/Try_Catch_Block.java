package day_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\gagan\\OneDrive\\Documents\\Gm.txt");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = br.readLine();
			while(line != null) {
				System.out.println("File contains " + line);
				line = br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("IO error occurred while reading the file ...");
		}
		finally {
			System.out.println("This is the complete execution ...");
		}
	}

}
