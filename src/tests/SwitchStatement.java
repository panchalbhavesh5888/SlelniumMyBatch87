package tests;

public class SwitchStatement {

	public static void main(String[] args) {

		
		String browser = "safari";  // firefox,chrome,safari,opera ,edge
		
		switch (browser) {
		case "firefox":
			
			System.out.println("open firefox");
			break;
			
		case "chrome":
			
			System.out.println("open chrome");
			break;
			
		case "safari":
			
			System.out.println("open safari");
			break;
			
		case "opera":
			
			System.out.println("open opera");
			break;
		case "edge":
			
			System.out.println("open edge");
			break;
			

		default:
			System.out.println(" no browser to open");
			break;
		}
	}

}
