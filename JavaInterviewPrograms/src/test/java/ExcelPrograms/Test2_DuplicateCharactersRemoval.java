package ExcelPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test2_DuplicateCharactersRemoval {

	public void removeDuplicateUsingList(String input) {

		input = input.toLowerCase();

		char[] inputarray = input.toCharArray();
		ArrayList<Character> l1 = new ArrayList<Character>();

		for (int i = 0; i < inputarray.length; i++) {

			if (!l1.contains(inputarray[i])) {
				l1.add(inputarray[i]);
			}
		}

		for (char a : l1) {
			System.out.print(a);
		}

	}

	public void removeDuplicateUsingSet(String input) {
		input = input.toLowerCase();

		char[] inputarray = input.toCharArray();

		HashSet<Character> s1 = new HashSet<Character>();

		for (int i = 0; i < inputarray.length; i++) {

			s1.add(inputarray[i]);
		}

		for (char a1 : s1) {
			System.out.print(a1);
		}

	}

	public static void main(String[] args) {

		Test2_DuplicateCharactersRemoval obj = new Test2_DuplicateCharactersRemoval();

		String input = "DeepakSharmaisaGoodgoodTester";

//		obj.removeDuplicateUsingList(input);
		obj.removeDuplicateUsingSet(input);

	}

}
