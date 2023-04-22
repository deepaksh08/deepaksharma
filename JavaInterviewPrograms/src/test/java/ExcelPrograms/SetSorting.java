package ExcelPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {
	
	
	public void sortSet(int[] intarray) {
		
		Set <Integer> S1 = new HashSet <Integer> ();
		
		for (int i = 0 ;i<intarray.length;i++) {
			
			S1.add(Integer.valueOf(intarray[i]));
		}
		
		
		Set <Integer> set = new TreeSet<Integer>(S1); 
		
		for (int a : set) {
			
			System.out.print(a + " ");
			
		}
		
	
		
		
	}
	
	public static void main(String[] args) {
		
	int [] inputarray = {3,4,8,2,1,12,20,18,16,21};
		
	SetSorting obj = new SetSorting();
	
	obj.sortSet(inputarray);
	
	
		
		
	}

}
