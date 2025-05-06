package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggetionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);

		//homework
		
		driver.findElement(By.id("gh-ac")).sendKeys("Canada");
		Thread.sleep(5000);

		List<WebElement> suggations = driver.findElements(By.xpath("//ul[@role='listbox']/li/a"));
		System.out.println(suggations.size());
		
		/*
		for(int i=0; i<suggations.size(); i++) {
			System.out.println(suggations.get(i).getText());
		}
		*/
		
		for(WebElement a : suggations) {
			System.out.println(a.getText());
		}


	}

}
