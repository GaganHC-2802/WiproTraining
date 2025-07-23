package Mod1;

public class PrintValues {
	 public static void main(String[] args) {
	    	String ani[] = {"dog", "cat", "fish"};
	        System.out.println("You passed " + args.length + " args.");
	        for (int i = 0; i < ani.length; i++) {
	            System.out.println("args[" + i + "] = " + ani[i]);
	        }
	    }
}
