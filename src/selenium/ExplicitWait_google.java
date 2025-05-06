package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/"); 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		
		driver.findElement(By.linkText("About")).click();		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle()); //About Page title
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));	
		System.out.println(driver.getTitle()); //Google Page Title
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));		
		System.out.println(driver.getTitle()); //About Page title
	}

}
