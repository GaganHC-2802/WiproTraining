package day_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {
		Set<Integer> setData = new TreeSet<Integer>();
		setData.add(10);
		//setData.add("hi");
		setData.add(20);
		//setData.add("hello");
		setData.add(5);//output will be ordered format
		System.out.println(setData);
		Iterator<Integer> itr = setData.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}

}
