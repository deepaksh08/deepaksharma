package ExcelPrograms;

public class ExceptionExecutionClass {

	private static final String exc = null;

	public static void main(String[] args) throws CustomException {

		CustomException ICE = new CustomException(exc);
		try {
			ICE.validateNumber(19);

		} catch (CustomException exc) {
			System.out.println("under catch block before stack trace");
			System.out.println("exception" + exc);
		}
		
		
		try { 
			ICE.Validatestring(null);
			System.out.println("String try block");
			
		} catch (CustomException estr) {
			
			System.out.println("under string catch block");
			System.out.println("----------------");
			estr.printStackTrace();
			System.out.println("--------- above one is strack trace---------");
			System.out.println("---------below one---");
			System.out.println(estr);
			
		}

	}

}
