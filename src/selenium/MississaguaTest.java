	package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaguaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(3000);
		
		List<WebElement> popUp = driver.findElements(By.xpath("//img[@id='ip-close-image']"));
		System.out.println("totoal popups are:"+popUp.size());
		
		if(popUp.size()>0) {
			for(WebElement p : popUp) {
				p.click();
			}
		}
	//	driver.findElement(By.id("ip-close")).click(); if there is only one element
		Thread.sleep(3000);

		
		
		driver.findElement(By.xpath("//button[text()='Our organization']")).click();
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println("total number of options are:"+ alloptions.size());
		
		for(WebElement a : alloptions) {
			System.out.println(a.getText());
		}

		}

}
