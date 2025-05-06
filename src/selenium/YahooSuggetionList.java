package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggetionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//homework
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1");
		//type Canada
		driver.findElement(By.id("ybar-sbq")).sendKeys("Canada");
		Thread.sleep(5000);
		
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("total suggatios are; "+ suggetions.size());
		
		for(int i=0; i<suggetions.size(); i++) {
			System.out.println(suggetions.get(i).getText());
		}

	}

}
