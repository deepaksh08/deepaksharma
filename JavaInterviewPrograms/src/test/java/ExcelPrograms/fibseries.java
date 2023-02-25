package ExcelPrograms;

public class fibseries {

	static int fib(int i) {

		if (i <= 1) {
			return i;
		} else {
			return fib(i - 1) + fib(i - 2);
		}

	}

	public static void main(String[] args) {

		int i = 10;

		for (int count = 0; count < i; count++) {

			
			System.out.println(fib(count));
		}

		

		

	}

}
