package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/"); //dirver .get(); and driver.nevigate().to(); both are same
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
