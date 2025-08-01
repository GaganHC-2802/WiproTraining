package day_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\gagan\\OneDrive\\Documents\\Gm.txt", true));
		br.write("Today is Aug1");
		//br.newLine();
		br.close();
		System.out.println("Written successfully");
	}

}
