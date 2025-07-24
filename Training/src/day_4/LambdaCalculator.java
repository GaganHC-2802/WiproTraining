package day_4;

interface Calculator{
	double add(double a, double b);
}
public class LambdaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator addition = (a,b) -> {
			System.out.println("Addition");
			double result = a+b;
			System.out.println("Result:" + result);
			return result;
			
		};
		Calculator subtraction = (a, b) -> a-b; //Lambda expression
		
	    
		double a = 1000.0, b = 2000.0;
		addition.add(a, b);
		System.out.println("Subtraction: " + subtraction.add(a,b));
	}

}
