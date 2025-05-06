package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> footer = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		//or List<WebElement> footer = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		//or List<WebElement> footer = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li"));
		//or List<WebElement> footer = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));


		System.out.println("Total number of footer on facebook page are: "+ footer.size());
		
		for(int i =0; i<footer.size(); i++) {
			System.out.println(footer.get(i).getText());
		}
	}

}
