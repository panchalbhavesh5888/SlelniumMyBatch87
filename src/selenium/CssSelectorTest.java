package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		/*
		 CSS Selector

	a. tagName[attributename='attributeValue'] - input[data-testid='royal_email'] - standard

	b. *[attributename='attributeValue']  - *[data-testid='royal_email'] - any tagName

	c. input[data-testid='royal_email'][id='email'] - *[data-testid='royal_email'][id='email'] - use multiple attributes

	d. Regular expression CSS
   input[data-testid*='yal_ema']  - input[data-testid*='yal_ema'] -  * Contains
   input[data-testid^='royal_ema']  - input[data-testid^='royal_ema'] - ^ starts-with
   input[data-testid$='yal_email']  - input[data-testid$='yal_email'] - $ ends with

	e. div[class='_6lux']>input  - div[class='_6lux']>input -  Mix CSS

	f. Special syntax for id - #email de cna drirectly use id as :By.cssSelector("#email")

	g. Special syntax for class - ._6lux - for clss we can you drirect :"._6luy _55r1 _1kbt" just put (.) at beginning, if there is any space in syntex of class then replace it with (.) :._8iep._8icy._9ahz._9ah-
	
   		._8iep._8icy._9ahz._9ah-  - Replace space with '.'
		 */
		
		//use cssselector to locate
		driver.findElement(By.cssSelector("#email")).sendKeys("ggfdsgfdfgfga"); //cssslector using (#)for id
		driver.findElement(By.cssSelector("._6luy._55r1._1kbt")).sendKeys("fdahdfahdhafhfhfh"); //cssselector using (.) for class
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
	}

}
