package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//when you have popup then close popup
		//when you have popup  write code to close popup
		//search canada
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);
		
		driver.switchTo().frame("google-ebay"); //switch to fame
		driver.switchTo().frame("credential_picker_iframe"); //switch in frame to other frame
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click(); //close the popup
		
		
		driver.switchTo().defaultContent(); //move back to original page
		driver.findElement(By.id("gh-ac")).sendKeys("computer");  //find search box and type computer
		
	}

}
