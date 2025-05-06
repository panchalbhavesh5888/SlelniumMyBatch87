package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		//Thread.sleep(5000);
		
		//to check search for anything and print search for anyting
		//first inpect where search for anything writen, but its not there is no text so cant use getText().
		//so we need to write getAttribute() ans check which attribute says "search for anything" and then put its value.in our case area-laber& placeholder.but whne we change value of placeholder thenit changes so we use place holder
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");//depricated means selenium will remove this method later form system
		System.out.println(s);
		
		//importnt for interview question
		//if we want to read what you type inputbox/website then its always use :getattribute("Value") doesn't metter if there is value attribute there or not
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		String p = driver.findElement(By.id("gh-ac")).getAttribute("Value");
		System.out.println(p);
	}

}
