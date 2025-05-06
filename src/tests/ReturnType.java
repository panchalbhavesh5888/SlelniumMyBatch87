package tests;

public class ReturnType {

	public static void main(String[] args) {

		int x=sum();
		System.out.println(x);
		System.out.println(sum());
		
		String y = hello();
		System.out.println(y );
		
		
	}

	public static int sum() {
		int a = 5+4;
		return a;
	}
	
	public static String hello() {
		String s = "Hello World";
		return s;		
	}
}
