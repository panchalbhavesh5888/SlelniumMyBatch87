package tests;

public class ArrayTest {

	public static void main(String[] args) {

		
		System.out.println("-------------StingArray------------");
		
		String tools[] = {"Selenuim","Java","Junit","TestNG","TestLink"};
		 System.out.println("total number of tools are:"+ tools.length);
		 
	/*	 System.out.println(tools[0]);
		 System.out.println(tools[1]);
		 System.out.println(tools[2]);
		 System.out.println(tools[3]);
		 System.out.println(tools[4]);
	*/	 
		 
		 for (int i =0; i<tools.length; i++) {
			 
			 System.out.println(tools[i]);
			 
		 }
		 
		 System.out.println("END");
		 
		 System.out.println("----------------intArray----------------");
		 
		 int num[] = {10,20,30,40,50};
		 
		 System.out.println("Lenght of array is:"+num.length);
		 
		 for(int i=0; i<num.length; i++) {
		 System.out.println(num[i]);
		 }
		 
		 System.out.println("End");
		 
		 System.out.println("------------MixArray-------------");
		 Object mix[] = {10,'c',"selenium",10.5,"True"};
		 
		 System.out.println("Lenght of array is:"+num.length);
		 
		 for(int i=0; i<mix.length; i++) {
		 System.out.println(mix[i]);
		 }
		 
		 System.out.println("End");
	}

}
