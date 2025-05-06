package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);
		//first locate element where we want to perform action(hower).ex .Electronics 
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		// we dont have build in class in fireforx driver to perform action(hower) .so we need you import build in selenium class Action to perform
		Actions builder = new Actions(driver); //now create object of Action class withc contains webelement in our case driver
		builder.moveToElement(electronics).build().perform();// builer.movetoelement(electronis) then we always write build().perform()-to preform action
		
		//whenever  we run any code related to hower dont move you mouse and try to keep above url at top
		
		Thread.sleep(3000);
		
		List<WebElement> topcategories = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[5]/li"));
	
		System.out.println(topcategories.size());
		
		for(WebElement a : topcategories) {
			System.out.println(a.getText());
		}
	}

}
