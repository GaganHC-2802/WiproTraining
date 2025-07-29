package day_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		
		System.out.println(data.get(1));
		System.out.println(data.indexOf(10));
		//data.add(10.5);
		//data.add("15");
		
		for(Object i : data) {
			int data1 = (Integer)i;
			System.out.println(data1);
		}
	}

}
