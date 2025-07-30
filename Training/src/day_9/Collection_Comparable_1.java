package day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Comparable_1 {

	public static void main(String[] args) {
		Comparator<Integer> c = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10)
					return 1;
				else 
					return -1;
			}
		};
		List<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(3);
		a.add(6);
		a.add(2);
		System.out.println(a);
		
		Collections.sort(a, c);
		System.out.println(a);
	}

}
