package ExcelPrograms;

public class StringIntegerMix {

	
	
	public static void main(String[] args) {
		
		
		String input =  "a3bcd1m3m34+&$dfdf5";
		
		input  = input.replaceAll("[^0-9]", " ");
		
		
//		input = input.replaceAll("[\\s@&.?$+-]+", " ");
		
		input = input.trim();
		
		input = input.replace(" ", "");
//		System.out.println(input);
		
		System.out.println(Integer.valueOf(input));
		
		char[] array = input.toCharArray();
		
		int sum = 0 ;
		
		for (int i = 0;i < array.length;i++) {
			
			sum = sum +  Character.getNumericValue(array[i]);
			
		}
		
		System.out.println(sum);

		
	
		 
		
		
		
		
		
	}
}
