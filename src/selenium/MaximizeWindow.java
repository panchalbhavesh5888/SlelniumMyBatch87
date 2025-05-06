package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.manage().window().maximize();//to maximize window
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();

	}

}
