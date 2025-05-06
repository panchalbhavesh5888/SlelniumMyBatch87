package tests;

public class ArgumentsTest {
	
	public static void main(String[] args) {
	
		sum();
		sum(10,10);
		sum(50, 100);
		sum(1,2,3);
	
	}
	
	
	public static void sum() {
		int a = 5+4;
		System.out.println(a);
	}
	
	public static void sum(int b, int c) {
		int a=b+c;
		System.out.println(a);
	}
	
	public static void sum(int b, int c, int d) {
		int a=b+c+d;
		System.out.println(a);
	}
	
	

}
