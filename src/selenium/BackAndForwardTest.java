package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());// about page title
		
		//to back and forward . we cant inpspect element or there is no htmt code for it so we have to use navigate()
		driver.navigate().back(); //google page
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); //google page title
		
		driver.navigate().forward();//About page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());//about page title
		

	}

}
