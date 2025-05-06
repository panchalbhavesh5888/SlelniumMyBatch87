package tests;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if - else condition
		int a=10;
		int b=20;
		
		if(a==b) {
			System.out.println("a and b are equal");
		} else {
			System.out.println("a and b are not equal");
		}
		
		
		
		String expected = "Hello";
		String actual = "Hello";
		
		if(expected.equals(actual)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}

		
		// if- else if condition
		
		String browser = "firefox";
		
		if (browser.equals("firefox")) {
			System.out.println(" open firefox");
		}
		else if(browser.equals("chrome")) {
			System.out.println("open chrome");
		}
		else {
			System.out.println("open safari");
		}
		
	}

}
