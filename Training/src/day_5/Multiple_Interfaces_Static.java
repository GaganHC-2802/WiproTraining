package day_5;

interface Interface_A {
	static void show() {
		System.out.println("Static show() in interface A");
	}
}

interface Interface_B {
	static void show() {
		System.out.println("Static show() in interface B");
	}
}

interface Interface_C {
	static void show() {
		System.out.println("Static show() in interface C");
	}
}

class MyClass_2 implements Interface_A, Interface_B, Interface_C {
	// Cannot override static methods from interfaces
	// So we can define a separate method if needed
	public void display() {
		System.out.println("Display method in MyClass");
	}
}

public class Multiple_Interfaces_Static {
	public static void main(String[] args) {
		MyClass_2 obj = new MyClass_2();
		obj.display();

		// Static methods are called via interface names, not via object
		Interface_A.show();
		Interface_B.show();
		Interface_C.show();
	}
}
