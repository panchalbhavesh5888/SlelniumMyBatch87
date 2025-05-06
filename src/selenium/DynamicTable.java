package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//number of raws and number of columns
		List<WebElement> rows =driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("number of rows:"+ rows.size());
		List<WebElement> columns =driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		System.out.println("number of clolumns:"+columns.size());
		Thread.sleep(5000);

		for(int i=2; i<=rows.size(); i++) {
			
			for(int j=1; j<=columns.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("   |   ");
			}
			
			System.out.println();
		}
		
	}

}
