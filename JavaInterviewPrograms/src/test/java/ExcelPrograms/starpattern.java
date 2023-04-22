package ExcelPrograms;

public class starpattern {

	public static void main(String[] args) {

		int i, j,k, count = 4;

		for (i = 0; i < count; i++) {
			
			for (j=count-1;j>i;j--) {
				System.out.print(" ");
			}

			for (k=0;k<=i;k++) {
				System.out.print("*");
			}	
			System.out.println();
		}

	}
}



//    *
//   **
//  ***
// ****
//*****