package ExcelPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting1 {
	
	
	
	public void mapsort(HashMap <Integer,String> map) {
		
		
		Map <Integer,String > tm = new TreeMap<Integer,String>(map);
		
		
		for (Integer s : tm.keySet()) {
			
			System.out.println("key is " +  s +  " and value is "+ tm.get(s));
			
		}
		
		
		System.out.println("map.isempty value is" + map.isEmpty());
		System.out.println("map size is " + map.size());
	}

	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
		
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    MapSorting1 obj = new MapSorting1();
	    
	    obj.mapsort(hashmap);
	    
	    

	}
}
