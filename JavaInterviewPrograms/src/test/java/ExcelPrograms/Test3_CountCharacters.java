package ExcelPrograms;

import java.util.HashSet;
import java.util.Set;

public class Test3_CountCharacters {

	public void countCharacters(String input) {
		
		char[] inputarray = input.toCharArray();
		
		System.out.println("No of characters in the String are " + inputarray.length);
		System.out.println(String.valueOf(inputarray));
		
	}
	
	public void countUniqueCharacters(String input) {
		
	input = input.toLowerCase();
	char[] inputarray = input.toCharArray();
	Set <Character> s = new HashSet<Character>();
	
	for (int i = 0 ; i < inputarray.length; i ++) {
	
		s.add(inputarray[i]);
	}
	
	System.out.println("No of Unique characters in the String are " + s.size());
	System.out.println(s);
	
	for(char c : s) {
		
		System.out.print(c);
	}
	
	
	
		
	}
	public static void main(String[] args) {
		
		Test3_CountCharacters obj = new Test3_CountCharacters();
		
		String input = "deepak Sharma Deepak is a good person";
		obj.countCharacters(input);
		obj.countUniqueCharacters(input);
		
		
	}
}
