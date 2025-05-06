package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1");
		
	
		
		List<WebElement> header = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(header.size());
		
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}
	}

}
