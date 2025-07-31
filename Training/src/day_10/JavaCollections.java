package day_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<>();
		courses.add("JAVA");
		courses.add("DBMS");
		courses.add("Testing");
		courses.add("JAVA");
		
		for(String c : courses) {
			System.out.println(c);
		}
		
		Set<Integer> Courses = new HashSet<>();
		Courses.add(1);
		Courses.add(2);
		Courses.add(1);
		Courses.add(4);
		
		for(int c1 : Courses) {
			System.out.println(c1);
		}
		
		Map<String, Integer> Course = new HashMap<>();
		Course.put("JAVA", 1);
		Course.put("DBMS", 2);
		Course.put("Testing", 1);
		Course.put("JAVA", 4);
		
		for(String c2 : Course.keySet()) {
			System.out.println(c2 + "=" + Course.get(c2));
		}
		
	}

}
