package day_5;

interface IF_A {
	default void show() {
		System.out.println("Default show() in interface A");
	}
}

interface IF_B {
	default void show() {
		System.out.println("Default show() in interface B");
	}
}

interface IF_C {
	default void show() {
		System.out.println("Default show() in interface C");
	}
}

class MyClass_3 implements IF_A, IF_B, IF_C {

	// Must override show() to resolve conflict from multiple default methods
	@Override
	public void show() {
		System.out.println("Overridden show() in MyClass");
	}
}

public class Multiple_Interface_Default {
	public static void main(String[] args) {
		MyClass_3 obj = new MyClass_3();
		obj.show();  // Calls overridden version in MyClass

		// Using interface references
		IF_A a = obj;
		IF_B b = obj;
		IF_C c = obj;

		a.show();  // All call MyClass's overridden show()
		b.show();
		c.show();
		
		
	}
}
