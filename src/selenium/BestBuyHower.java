package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BestBuyHower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		Thread.sleep(5000);
		
	/*	List<WebElement> popUp = driver.findElements(By.xpath("//button[@aria-label='Close']"));
		System.out.println("total number of popup are:"+ popUp.size());
		
		if(popUp.size()>0) {
			for(WebElement p : popUp) {
				p.click();
			}
		}*/
		//or
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();  // to  close popup
		Thread.sleep(3000);

		 driver.findElement(By.xpath("//li[@data-automation='hMenu-shop-0']")).click();
		 
		 List<WebElement> alloptions = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]//*[contains(@class,'style-module_menuLink')]"));
		//or - (//div[@data-automation='menu-main-l1'])[1]//*[@class='style-module_menuLink__-DPKO']
		 System.out.println("Total number of options available are:"+ alloptions.size());
		
		for(WebElement a : alloptions) {
			System.out.println(a.getText());
		}

	}

}
