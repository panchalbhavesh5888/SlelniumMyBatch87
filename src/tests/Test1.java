package tests;

import selenium.Test4;

public class Test1 {
	
	static Test1 t1 = new Test1();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	// ctrl+shift+o and it will import selenium.Test4 class in line 3.

	public static void main(String[] args) {

		System.out.println("i am in main method");
		printme();
		System.out.println("after print me method");
		designme();
		System.out.println("after designme method");
		scanme();
		System.out.println("after scanme method");
		Test2.readme();
		
		//to call non static method(testme()) need t ocreate object of 
		//non static method- Test1 t1 = new Test1();
		t1.testme();
		System.out.println("after testme method");
		t1.paintme();
		System.out.println("after paintme method");
		Test3.circle(); //5  calling static method circle from Test3 class
		t3.square();  //6   calling non static method from Test3 class by creating object t3
		
		t4.blue(); // CALLING METHOD FROM selenium patckage Test4 class
		
	}
	
	public static void printme() {
		System.out.println("printme method");	
	}
	
	public static void scanme() {
		System.out.println("scanme method");
	}
	
	public static void  designme() {
		System.out.println("designme method");
	}
	
	//this is non static method 
	public void testme() {
		System.out.println("testme method");
	}
	
	public void paintme() {
		System.out.println("paintme method");
	}
}
