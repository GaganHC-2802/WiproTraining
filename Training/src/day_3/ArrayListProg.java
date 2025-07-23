package day_3;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Kiwi");
		fruits.add("Guava");
		
		System.out.println(fruits.size());
		
		Collections.sort(fruits);
		
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		for(String i : fruits) {
			System.out.println(i);
		}
		
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		fruits.set(3, "Banana");
		System.out.println(fruits);
		fruits.remove(2);
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(97);
		marks.add(87);
		marks.add(55);
		marks.add(100);
		marks.add(77);
		
		Collections.sort(marks);
		for(int i=0; i<marks.size(); i++) {
			System.out.println(marks.get(i));
		}
		
	}

}
