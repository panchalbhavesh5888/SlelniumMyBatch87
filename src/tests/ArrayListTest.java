package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 

		//the mani differance between Array amd Arraylist is 
		//in array once you declare array you can not modify array
		//however in ArrayList you can modify any time(add,remove,modify)
		
		//classname objectname = new classname();
		ArrayList<String> tools = new ArrayList<String>();
		//ctrl+shift+o to import ArrayList<> for java.util class
		
		tools.add("selenium");
		tools.add("java");
		tools.add("JUnit");
		tools.add("TestNG");
		tools.add("Jenkin");
		
		
		System.out.println("Size of ArrayList is:" + tools.size());
		/*
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		*/
		
		for(int i=0; i<tools.size(); i++) {
			System.out.println(tools.get(i));
		}
		
		for( String s: tools) {
			System.out.println(s);
		}

		
		
		System.out.println("------------------------");
		
		tools.remove(2); //will remove junit
		System.out.println(tools.get(2));//will  print TestNG
		System.out.println("ArrayList size is:"+ tools.size());
		
 
	}

}
