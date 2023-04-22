package ExcelPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test1_Stringduplicatewordsremoval {

	public void removeDuplicateUsingList(String input) {

		String[] arrayinput = input.split("\\s");

		ArrayList<String> list1 = new ArrayList<String>();

		for (int i = 0; i < arrayinput.length; i++) {
			if (!list1.contains(String.valueOf(arrayinput[i]))) {
				list1.add(String.valueOf(arrayinput[i]));

			}

		}

		for (String s1 : list1) {
			System.out.print(s1 + " ");

		}
		System.out.println();

	}

	public void removeDuplicateUsingSet(String input) {

		String[] arrayinput = input.split("\\s");

		HashSet<String> set = new HashSet<String>(Arrays.asList(arrayinput));

		for (String s : set) {
			System.out.print(s + " ");

		}

	}

	public static void main(String[] args) {

		Test1_Stringduplicatewordsremoval obj = new Test1_Stringduplicatewordsremoval();

		String input = "Deepak Sharma Deepak Deepak is a Good Bad Good Sharma";

		System.out.println("below is the output for implementation using List");
		obj.removeDuplicateUsingList(input);

		System.out.println("below is the output for implementation using set");
		obj.removeDuplicateUsingSet(input);

	}

}
