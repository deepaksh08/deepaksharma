package ExcelPrograms;

public class DuplicateCharacter {

	public void removeDuplicate(String input) {

		char[] characterArray = input.toCharArray();

		for (int i = 0; i < characterArray.length - 1; i++) {

			if (characterArray[i]!=0) {
				
			
			for (int j = i + 1; j < characterArray.length; j++) {

				if (characterArray[i] == characterArray[j]) {
					characterArray[j] = 0;
				}
			}
			System.out.print(characterArray[i]);
			}
			
			

		}

	}

	public static void main(String[] args) {

		String Name = "Deepak Sharma";
		DuplicateCharacter obj = new DuplicateCharacter();

		obj.removeDuplicate(Name);

	}

}
