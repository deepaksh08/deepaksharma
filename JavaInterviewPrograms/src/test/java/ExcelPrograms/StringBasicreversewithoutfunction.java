package ExcelPrograms;

import java.sql.Date;
import java.util.Arrays;

public class StringBasicreversewithoutfunction {

	public String reverseAString(String stringinput) {
		char[] ch = stringinput.toCharArray();
		char[] newarray = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			newarray[i] = ch[ch.length - i - 1];
		}
		String stringoutput = new String(newarray);

		if (stringoutput.equals(stringinput)) {
			System.out.println("palindrome example caught");
		} else {
			System.out.println("hmmm this is again not a palindrome");
		}
		return stringoutput;
	}

	public String reverseEachWordInString(String stringinput) {

		String splitstringarray[] = stringinput.split("\\s");
		String finalstring = "";

		for (String s : splitstringarray) {

			char[] ch = s.toCharArray();
			char[] newarray = new char[ch.length];
			for (int i = 0; i < ch.length; i++) {
				newarray[i] = ch[ch.length - i - 1];
			}
			String stringoutput = new String(newarray);

			finalstring += stringoutput + " ";
		}

		return finalstring;
	}

	public String capFirstChar(String stringinput) {

		String splitstringarray[] = stringinput.split("\\s");
		String finalstring = "";

		for (String s : splitstringarray) {

			String first = s.substring(0, 1);
			String afterfirst = s.substring(1);

			finalstring += first.toUpperCase() + afterfirst.toLowerCase() + " ";

		}

		return finalstring.trim();
	}

	public void checkStringAsAnagram(String S1, String S2) {

		S1 = S1.replace("\\s", "");
		S2 = S2.replace("\\s", "");

		S1 = S1.toLowerCase();
		S2 = S2.toLowerCase();

		char[] ch1 = S1.toCharArray();
		char[] ch2 = S2.toCharArray();

		Arrays.sort(ch2);
		Arrays.sort(ch1);
		if (Arrays.equals(ch1, ch2) == true) {
			System.out.println("this is example of anagram");
		} else {
			System.out.println("this is not an example of anagram");
		}

	}

	public int countWordsInString(String S1) {
		
		String [] splitarray = S1.split("\\s");
		int count = 0;
		
		for (String s : splitarray) {
			
			if (s.isEmpty()) {
				continue;
			}else {
				count++;
			}
				
			}
		return count;
	}
	
	public void swapTwoStringsWithoutThird(String S1,String S2) {
		
		System.out.println("Before Swipe S1" + S1);
		System.out.println("Before Swipe S2" + S2);
		System.out.println(S1.length() + "" +S2.length() );
		
	
		
		S1 = S1 + S2;
		
		S2 = S1.substring(0, S1.length()-S2.length());
		S1 = S1.substring(S2.length());
		
		System.out.println("After Swipe S1" + S1);
		System.out.println("After Swipe S2" + S2);
		
		
		
	}

	public static void main(String[] args) {
		String stringinput = "palapa";
		StringBasicreversewithoutfunction Obj = new StringBasicreversewithoutfunction();

		String result = Obj.reverseAString(stringinput);
		System.out.println(result);

		String result1 = Obj.capFirstChar(result);
		System.out.println(result1);

		String result3 = Obj.reverseEachWordInString(stringinput);
		System.out.println(result3);

		String S1 = "Deepak";
		String S2 = "Rani Sh";
		Obj.checkStringAsAnagram(S1, S2);

		System.out.println(Obj.countWordsInString(S1));
		
		Obj.swapTwoStringsWithoutThird(S1, S2);
		
		
		
		
		

	}
}
