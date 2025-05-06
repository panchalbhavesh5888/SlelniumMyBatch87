package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//to read for properties file 
		FileInputStream fi = new FileInputStream("C:\\QA1\\Testing\\prop.properties");//location of file with filName.FileType//
		Properties prop = new Properties();//java.util to read write in  properties file
		prop.load(fi);
		
		String browser =prop.getProperty("browser");
		WebDriver driver;//here driver is null

		if(browser.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			 driver = new ChromeDriver();
		}else {
			 driver = new SafariDriver();
		}
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("ggfdsgfdfgfga");
		driver.findElement(By.id("pass")).sendKeys("fdahdfahdhafhfhfh");
		driver.findElement(By.name("login")).click();
		

	}

}
