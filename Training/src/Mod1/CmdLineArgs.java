package Mod1;

import Mod1.calc_RuntimeData;

public class CmdLineArgs {
	public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
    	calc_RuntimeData calc = new calc_RuntimeData();
        int sum = calc.add(3, 4);
        System.out.println("Sum = " + sum);
    }
}
