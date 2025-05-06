package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca/");
		driver.findElement(By.id("APjFqb")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
	//	or //ul[@role='listbox']/li(xpath)
		System.out.println("Total suggetion are: "+ allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		

	}

}
