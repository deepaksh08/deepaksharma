package ExcelPrograms;

public class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
	
void validateNumber (int num) throws CustomException {
		
		if (num <18) {
			
			throw new CustomException("This is custom exception message in implement class under the method with throw new keyword");
		}
	}

void Validatestring (String st) throws CustomException {
	
	if (st==null) {
		throw new CustomException("String is null");
	}
}

}







