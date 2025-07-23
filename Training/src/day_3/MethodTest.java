package day_3;
import java.util.Random;
import java.util.random.RandomGenerator;
public class MethodTest {
	public static void main(String[] args) {
		long random10DigitNumber = generateTenDigitRandomNumber();
		System.out.println("Random 10 digit number: " + random10DigitNumber);
	}
	
	public static long generateTenDigitRandomNumber() {
		MethodTest random = new MethodTest();
		long min = 1000000000L;
		long max = 9999999999L;
		
		long random10DigitNumber = min + ((long)(((RandomGenerator) random).nextDouble() * (max - min + 1)));
		return random10DigitNumber;
	}
}
