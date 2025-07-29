package day_8;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		Integer i = a; //when we convert int to Integer it is called autoboxing
		//int b = i.intValue(); // object back to primitive datatype is called auto-unboxing
		int b = i; //auto-unboxing
		System.out.println(i);
		System.out.println(b);
	}

}
