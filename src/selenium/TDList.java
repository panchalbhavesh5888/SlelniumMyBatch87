package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// HomeWork
		//8 footer
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking");
		Thread.sleep(8000);
		
		List<WebElement> footer = driver.findElements(By.xpath("//ul[@class='cmp-footer__links']/li"));
		System.out.println(footer.size());
		
		for(int i=0; i<footer.size(); i++) {
			System.out.println(footer.get(i).getText());
		}
		
	}

}
