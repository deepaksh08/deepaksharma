package ExcelPrograms;

public class CounterFucntiontoCountCharacter {
	
	public static void countcharacters(String name) {
		char[] CharArrayofName = name.toCharArray();
		for (int i = 0; i < CharArrayofName.length; i++) {
			int counter = 1;
			for (int j = i + 1; j < CharArrayofName.length; j++) {
				if (CharArrayofName[i] == CharArrayofName[j] && CharArrayofName[i] != ' ') {
					counter++;
					CharArrayofName[j]='0';
				}
			}			
			if (CharArrayofName[i]!='0' && CharArrayofName[i]!=' ') {
				System.out.println(CharArrayofName[i]+ " count is equals to " + counter);
			}
		}
		
	}


	public static void main(String[] args) {
		
		String name = "aaa bb cccc dd eeee ff ggggg";

		CounterFucntiontoCountCharacter.countcharacters(name);
		
//		System.out.println("Hello");



	}

	
}
