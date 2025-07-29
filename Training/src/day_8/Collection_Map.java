package day_8;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map {

	public static void main(String[] args) {
		Map<String , Integer> mapData = new HashMap<String , Integer>();
		mapData.put("A", 21);
		mapData.put("B", 20);
		mapData.put("C", 23);
		mapData.put("D", 19);
		System.out.println(mapData.keySet());
		System.out.println(mapData.values());
		
		for(String key:mapData.keySet()) {
			System.out.println(key + " : " + mapData.get(key));
		}
	}

}
