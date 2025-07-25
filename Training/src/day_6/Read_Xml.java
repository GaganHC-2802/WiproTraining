package day_6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Xml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BufferedReader reader = null;

	        try {
	        	reader = new BufferedReader(new FileReader("C:\\Users\\gagan\\Downloads\\1.4-KB-XML-File.xml"));

	        	String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println("XML Line: " + line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("XML file not found.");
	        } catch (IOException e) {
	            System.out.println("Error reading XML file.");
	        } finally {
	            try {
	                if (reader != null)
	                    reader.close();
	            } catch (IOException e) {
	                System.out.println("Error closing XML reader.");
	            }
	        }
	    }
	}