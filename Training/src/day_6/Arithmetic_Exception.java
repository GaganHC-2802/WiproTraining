package day_6;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=9;
			int b=0;
			int c=a/b;
			System.out.println("The answer"+c );
		}
		catch(ArithmeticException e) {
			System.out.println("divisble problem error");
		}
		finally {
			System.out.println("running program");
		}

	}

}