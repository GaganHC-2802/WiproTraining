package day_3;
import java.util.LinkedList;

public class LinkedListProg {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<String>();

		countries.add("USA");
		countries.add("India");
		countries.add("UAE");
		countries.add("UK");
		countries.add("Germany");
		System.out.println(countries);
		
		countries.addFirst("UAE");
		System.out.println(countries);
		countries.addLast("USA");
		System.out.println(countries);
		 
		countries.removeFirst();
		countries.removeLast();
		
		System.out.println(countries.getFirst());
		System.out.println(countries.getLast());
	}
}

