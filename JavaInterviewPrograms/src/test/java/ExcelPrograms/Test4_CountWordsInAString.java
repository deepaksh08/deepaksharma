package ExcelPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Test4_CountWordsInAString {
	
	
	public void countWordsusingList(String input){
		
		String[] inputarray = input.split("\\s");
		System.out.println("No of words in the given string are " + inputarray.length);	
		
	}
	
	public void countUniqueWordsUsingSet (String input){
		
		String[] inputarray = input.split("\\s");
		
		HashSet<String> s =  new HashSet<String>(Arrays.asList(inputarray));
		
		System.out.println("No of unique words in the given string are " +  s.size() +"  " + s.toString());
	}
	
	public static void main(String[] args) {
		
		Test4_CountWordsInAString obj = new Test4_CountWordsInAString();
		String input = "deepak Sharma deepak Deepak is a good a good person";
		
		obj.countUniqueWordsUsingSet(input);
		obj.countWordsusingList(input);
	}

}
