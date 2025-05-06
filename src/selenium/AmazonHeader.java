package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		//size and text for all headers
		
		List<WebElement> header = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(header.size());
		
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}
	}

}
