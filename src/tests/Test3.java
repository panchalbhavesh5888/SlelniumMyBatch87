package tests;

public class Test3 {
	static Test3 t3 = new Test3();
	static Test1 t1 = new Test1();

	public static void main(String[] args) {

	Test3.circle();	//3 calling static method circle
	t3.square();	//4 calling non-static method square
	Test1.printme(); //7 calling static method from Test1 class
	t1.testme();  //8. calling non static metho from Test1 class by creating object t1	
	}
	
	//1 static method circle
	public static void circle() {
		System.out.println("circle method");
	}
	
	//2  non static metho square
	public void square() {
		System.out.println("square method");
	}

	public Test3(){
		System.out.println("i am constructor");
	}
	
	//here you will see thet in output you will see " i am in constructor" 2 time, because whenever you run any class it will run glober verial first,
	//then check objects and then will run mai method. 
	//in Test3 class..first it will detect(	static Test3 t3 = new Test3();)so it will run contructor first
	//then it will run (static Test1 t1 = new Test1()) which is oject for Test1 class so it will check Test1class, where it goes through oject and will find
	//t3 Test3 object so it will run constructor ofr Test3 class again and will will have 2 time " i am in contructor"
}
