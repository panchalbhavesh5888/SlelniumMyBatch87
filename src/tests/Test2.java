package tests;

public class Test2 {
	static Test1 t1 = new Test1();

	public static void main(String[] args) {

		
		Test1.printme();
		Test1.scanme();
		Test1.designme();
		
		
		t1.paintme();
		t1.testme();
	}
	
	public static void readme() {
		System.out.println("i am in readme methods of Test 2 class");
	}

}
