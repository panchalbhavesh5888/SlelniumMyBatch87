package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(3000);
		
		WebElement cheese = driver.findElement(By.xpath("//input[@value='Cheese']"));
		JavascriptExecutor jse = driver; //built in selenium class to scroll down to the element which we want ot bring in view
		
		//option-1  scroll by x and y cordinates
		//jse.executeScript("window.scrollBy(0,1000)");
		//System.out.println(cheese.getLocation());
		//cheese.click();
		
		//option-2 scroll until element is in the view
		//jse.executeScript("arguments[0].scrollIntoView(true)", cheese);
		//cheese.click();	
		
		//option-3 direct click using JavaScriptexecuter class
		jse.executeScript("arguments[0].click();", cheese);

	}

}
