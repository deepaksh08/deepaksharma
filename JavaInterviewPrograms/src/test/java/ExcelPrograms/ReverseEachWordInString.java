package ExcelPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseEachWordInString {

	public void Reverse(String input) {

		String[] arrayinput = input.split("\\s");

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrayinput));
		String finalstring = "";
		
		
		
				
		
		
		for (String s : list) {
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			
			
			
			finalstring = finalstring +" "+  sb.toString();
			
			
			}
		
		System.out.println(finalstring);

	}

	public static void main(String[] args) {

		ReverseEachWordInString obj = new ReverseEachWordInString();
		String input = "Deepak Sharma is a Good Tester";

		obj.Reverse(input);

	}
}
