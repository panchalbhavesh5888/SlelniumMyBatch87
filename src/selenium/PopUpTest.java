package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		//1. if popup-> close popip->search computer
		//2.if no-popup-> drirectly search computer
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(5000);
		
		List<WebElement> popUp = driver.findElements(By.className("_24EHh"));
		System.out.println("total number of popup are:"+ popUp.size());
		
		if(popUp.size()>0) {
			for(WebElement p : popUp) {
				p.click();
			}
			driver.findElement(By.id("search-words")).sendKeys("computer");
		}
		else 
		{
			driver.findElement(By.id("search-words")).sendKeys("computer");
		}
			
		

	}

}
