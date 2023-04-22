package ExcelPrograms;

import org.apache.commons.lang3.RandomStringUtils;

public class Test5Random {

	public static void main(String[] args) {

		String S = RandomStringUtils.randomAlphabetic(4);

		System.out.println(S);

		 String S1 = RandomStringUtils.randomNumeric(4);

		int a = Integer.valueOf(S1);

		System.out.println(a);
	}
}
