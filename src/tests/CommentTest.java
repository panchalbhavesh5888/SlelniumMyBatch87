package tests;

public class CommentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// single line comment
		String testing = "Automation";
		//System.out.println(testing);//Automation
		
		String tool = "selenium";
		//System.out.println(tool);//selenium
		
		String s="  ";
		
		System.out.println(testing+tool);//Automationselenium
		System.out.println(testing+"  "+tool);//Automation  selenium
		System.out.println(testing+    tool);//Automationselenium
		System.out.println(testing+s+tool);//Automation  selenium
		
		
		/* multile line comment*/
		//int a=10;
		//int b=20;
		
		/*System.out.println(testing+tool+a+b);
		System.out.println(a+b+testing+tool);
		System.out.println(testing+tool+(a+b));
		*/

	}

}
