package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);//close popup manually
		// write code foe all cetegory on ebay size siaze and text
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println("total Option are available under all categories: "+ allOptions.size());
		
		
		//now checking lin all cetegory lise with option is selected using( allOptions.get(i).isSelected())
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText()+"-------------"+allOptions.get(i).isSelected());
		}
		
		// to select from dropdown we need to create object of built in select selenium class and then need to pass webelemt of the location from where we like to select
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropDown);//Select s = new Select(); here hower on Select and import from slenium .now -new select() is asking for WebElement
		// so we need to create in line 30 WebElemtnt
		Thread.sleep(2000);//close popup manually

		
		
		
		s.selectByIndex(2); //Art
		Thread.sleep(2000);
		
		s.selectByValue("2984"); //Baby
		Thread.sleep(2000);
		
		s.selectByVisibleText("Automotive"); //Automotive
		Thread.sleep(2000);
		
		s.selectByContainsVisibleText("Business");
		
		
		System.out.println("-----------------------------------------After Selection----------------------------------------------------------------");
		
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText()+"-------------"+allOptions.get(i).isSelected());
		}
	}

}
