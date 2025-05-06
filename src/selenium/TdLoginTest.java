 package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TdLoginTest {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://authentication.td.com/uap-ui/?consumer=easyweb&locale=en_CA#/uap/login");
		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys("12345678766@1233");
		driver.findElement(By.xpath("//input[@id='uapPassword']")).sendKeys("dsgagfhdfhhsd");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-block td-button-secondary']")).click();		
	}

}
