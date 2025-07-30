package day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Student[age = " + age + ", name = "  + name + "]";
	}
}
public class Comparator_String {

	public static void main(String[] args) {
		Comparator<Student> s1 = new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age > j.age)
					return 1;
				else
					return -1;
			}
		};
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(22, "Gagan"));
		stud.add(new Student(21, "Jay"));
		stud.add(new Student(24, "Karthik"));
		stud.add(new Student(23, "Mahesh"));
		
		Collections.sort(stud, s1);
		
	for(Student s : stud )
		System.out.println(s);
	
	}

}
