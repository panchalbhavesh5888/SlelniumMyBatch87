package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// FooterTest
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	//	WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']")); //first find element of footer section
	//	List<WebElement> all = footer.findElements(By.tagName("a")); // then add as footer.findelements(By.tagname("a"));
		
		//to find only leftside footer
		List<WebElement> leftFooter = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println("total Number of links are: "+leftFooter.size());
		
		
		for(int i=0; i<leftFooter.size(); i++) {
			System.out.println(leftFooter.get(i).getText());
			
		}
	}

}
