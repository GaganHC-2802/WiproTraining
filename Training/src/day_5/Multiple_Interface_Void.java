package day_5;

interface A {
	void show();
}

interface B {
	 void show();
}

interface C {
	void show();
}

class MyClass implements A, B, C {
 
	public void show() {
		System.out.println("Common show() method implementation");
	}
}

public class Multiple_Interface_Void {
 public static void main(String[] args) {
     MyClass obj = new MyClass();

     obj.show();

     
     A a = obj;
     B b = obj;
     C c = obj;

     a.show(); 
     b.show(); 
     c.show(); 
 	}
}


