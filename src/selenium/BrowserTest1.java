package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import selenium.Xls_Reader;

public class BrowserTest1 {

	public static void main(String[] args) {
		// first all 5 jars @ project lvl
		//add xls_reader class @ package
		//create opject of the xls_reader class
		Xls_Reader d = new Xls_Reader("C:\\QA1\\Testing\\NikulTest.xlsx");
		
	

		
		String browser =d.getCellData("Data1","Browser", 2);
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
