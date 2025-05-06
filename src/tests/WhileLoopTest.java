package tests;

public class WhileLoopTest {

	public static void main(String[] args) {

		
		int i =1;
		
		while(i<=10) {
			System.out.println(i);
			
		if(i==7) {
			System.out.println("got" + i);
			break;
		}
		
		i++;
		
		}
		
		System.out.println("Hello");
	}

}
