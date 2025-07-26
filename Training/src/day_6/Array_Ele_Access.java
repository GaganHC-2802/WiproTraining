package day_6;

public class Array_Ele_Access {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array with 5 elements

        try {
            System.out.println("The 6th element is: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
        	System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
