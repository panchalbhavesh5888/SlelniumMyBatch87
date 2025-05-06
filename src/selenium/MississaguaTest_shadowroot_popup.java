package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaguaTest_shadowroot_popup {
	
	public static void main() {
	
	
	FirefoxDriver driver = new FirefoxDriver(); 
	driver.get("https://www.mississauga.ca/");

	//Use Chrome. Right click --> copy JS Path

	//document.querySelector("#engagement-container-128785").shadowRoot.querySelector("#ip-no")
	String s = "return document.querySelector(\"#engagement-container-128785\").shadowRoot.querySelector(\"#ip-no\")";
	WebElement close = (WebElement) driver.executeScript(s);
		
	}

}