package ExcelPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ReadingMap {
	
	
	public void mapreading(HashMap <String,String> map) {
		
		Set<String> set = map.keySet();
		
	Iterator itr = set.iterator();
	
	
	while (itr.hasNext()) {
		
		String s = (String) itr.next();
		
		System.out.println("key is " + s + " value is "+ map.get(s));
	}
	
	System.out.println( "----------");
		
	for (String s : set) {
		
		System.out.println("KEY IS " +  s + " VALUE IS " +  map.get(s));
		
	}
	
	 for (String key : map.keySet()) {
	        System.out.println("key: " + key + " value: " + map.get(key));
	    }

	

		
		
		
	}
	
	public static void main(String[] args) {
		
		ReadingMap obj = new ReadingMap();
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("firstname", "deepak");
		map.put("lastname", "sharma");
		map.put("address", "delhi");
		map.put("country", "india");
		
		obj.mapreading(map);
		
		
		 for (String key : map.keySet()) {
		        System.out.println("key: " + key + " value: " + map.get(key));
		    }
	}

}
