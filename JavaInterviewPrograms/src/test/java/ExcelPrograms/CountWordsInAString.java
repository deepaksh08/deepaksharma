package ExcelPrograms;

public class CountWordsInAString {
	
	public void countString(String input) {
		
		String[] splited = input.split("\\s");
		
		
		int count = 0;
		
		for (int i = 0 ; i<splited.length;i++) {
			
			if(splited[i]!="") {
				count++;
				
			}
				
		}
		
		System.out.println("Lenght of this string is " +count );
		
	}

	
	public static void main(String[] args) {
		String input = "Hello        Quality       ";
		
		CountWordsInAString obj = new CountWordsInAString();
		obj.countString(input);
	}
}
