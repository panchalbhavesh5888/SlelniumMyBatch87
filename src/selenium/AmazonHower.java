package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//home work
		//hower on sign-in and get size and text
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(signin).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> alloptions =  driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println("Total number of options available are:"+ alloptions.size());
		
		for(WebElement a : alloptions) {
			System.out.println(a.getText());
		}

	}

}
