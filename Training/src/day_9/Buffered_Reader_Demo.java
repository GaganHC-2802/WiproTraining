package day_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered_Reader_Demo {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		int a = Integer.parseInt(ir.readLine());
		System.out.println(a);
		br.close();
		ir.close();
		}

}
