package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		
		List<WebElement> header = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']/div/a"));

		
		
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
			
		}
		
		
	//	driver.findElement(By.linkText("About")).click();
		
	}

}
