package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1");
		
		//Trendin Now as per photo (size 10 and text)
		
		List<WebElement> trendingList = driver.findElements(By.xpath("//div[@data-test-locator='trending-general-list']//a"));
		System.out.println(trendingList.size());
		
		for(int i=0; i<trendingList.size(); i++) {
			System.out.println(trendingList.get(i).getText());
		}
		
		
	}

}
