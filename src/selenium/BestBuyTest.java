package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//li[@data-automation='hMenu-shop-0']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//*[contains(@id,'hMenu-shop-0-1')]"));
		// List<WebElement> alloptions = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]//*[contains(@class,'style-module_menuLink')]"));
		
		System.out.println("Total options available are:"+ options.size());
		Thread.sleep(3000);
		
		for(WebElement o:options) {
			System.out.println(o.getText());
		}

	}

}
