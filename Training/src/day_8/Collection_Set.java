package day_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set setData = new HashSet();
		setData.add(10);
		setData.add("hi");
		setData.add(20);
		setData.add("hello");
		System.out.println(setData);
		Iterator<Integer> itr = setData.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

}
