package selenium;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		
		
		List<WebElement> footer = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
	
		System.out.println("total number of footer are:" + footer.size());
		
		for(int i=0; i<footer.size(); i++) {
			
			System.out.println(footer.get(i).getText());
			
		}
		//Email
		//1.classname- we cant you classname because classname contains space so we cant use
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hshhjgdfhsghgfhgfh");
		
		//2.CssSelector -we need to learn syntex first
		
		//3.id - working
		//driver.findElement(By.id("email")).sendKeys("gjfjdjggjdffhgf");
		
		//4. LinkText -there is no link. only for link(when tag name is A,then only we can say it is link)
		
		//5.Name - wroking
		//driver.findElement(By.name("email")).sendKeys("gjfjdjggjdffhgf");
		
		//6.PartialLinktest - only for link
		
		//7.TagName- need unique tagname- in our senario there si no unique teagname
		//driver.findElement(By.tagName("input")).sendKeys("gjfjdjggjdffhgf");
		
		//8. xPath- need to learn syntax
		//driver.findElement(By.xpath(null)).sendKeys("gjfjdjggjdffhgf");
		
		
		//password
		//driver.findElement(By.id("pass")).sendKeys("fdahdfahdhafhfhfh");
		
		//Login Butoon
		//driver.findElement(By.name("login")).click();

		
		
		
	}

}
