package ExcelPrograms;

public class ReverseAStringBasic {

	public String revstring(String inputstring) {
		StringBuilder outputstring1 = null;

		StringBuilder str = new StringBuilder(inputstring);
		outputstring1 = str.reverse();
//		str.append("testappender");
		
		
		
		String outputstring = outputstring1.toString();
		if (outputstring.equals(inputstring)) {
			System.out.println("This is a Palindrome example");
		} else {
			System.out.println("This is not a Palindrome example");
		}

		return outputstring;
	}

	public static void main(String[] args) {

		String inputstring = "padap deepak";
		
	

		ReverseAStringBasic Obj = new ReverseAStringBasic();

		System.out.println(Obj.revstring(inputstring));

	}

}
