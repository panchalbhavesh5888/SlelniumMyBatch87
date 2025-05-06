package tests;

public class DataTypes {

	public static void main(String[] args) {
//1. Int
		System.out.println("-------------int-------------");
		int i=10;
		System.out.println(i);//10 
		i=20;
		System.out.println(i);//20
		i=i+10;
		System.out.println(i);//30
		i=i*2;
		System.out.println(i);//60
		System.out.println(i*2);//120
		System.out.println(i);//60
		
		//post increment(i++)= first print value and then increase the value  
		System.out.println(i++);//60
		System.out.println(i);//61
		
		//pre increment(++i)= first increase the value and then print
		System.out.println(++i);
		System.out.println(i);
//2. Double		
		System.out.println("------------Double---------------");
		
		double d;
		d=10.2;
		System.out.println(d);//10.2
		System.out.println(d*2);//20.4
		System.out.println(d/2);//5.1
		System.out.println(11/2);//5 bcz int devide by int so ans will int
		System.out.println(10.1/2);//5.05  double devide by int and will double
		System.out.println(10/2.0);//5.0   int device by double ans will double
//3. Char		
		System.out.println("------------char-------------------");
		char c='a';
		System.out.println(c);//a
		
		//perform aerithmetic operation will you ascii charecter value
		System.out.println(c+1);
		System.out.println(c*2);
		
		//post increment
		System.out.println(c++);//a then store value as b
		//pre increment
		System.out.println(++c);// c
		
//4. boolean  true or false
		System.out.println("--------------Boolean----------------");
		boolean b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		
		
		
	}

}
