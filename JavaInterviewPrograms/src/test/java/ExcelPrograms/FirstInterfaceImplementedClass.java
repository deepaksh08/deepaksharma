package ExcelPrograms;

public class FirstInterfaceImplementedClass {

	public void hello() {
		System.out.println("Hello this is implemented method");
	}

	public static void main(String[] args) {

//		FirstInterfaceImplementedClass obj = new FirstInterfaceImplementedClass();
//		obj.hello();

//		
//		FirstInterface obj = new FirstInterface() {
//			
//			public void hello() {
//				System.out.println("Hello");
//				
//			}
//		};
//		
//		obj.hello();

		FirstInterface obj = (a) -> {System.out.println("hello"+a);
		};

		obj.hello(3);

	}

}
