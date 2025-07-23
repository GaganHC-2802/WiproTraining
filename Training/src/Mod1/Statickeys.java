package Mod1;

import Mod1.Utils;

class Utils {
    public static int add(int x, int y) {
        return x + y;
    }
}
public class Statickeys {
	public static void main(String[] args) {
        int sum = Utils.add(5, 7);  
        System.out.println(sum);    
    }
}
