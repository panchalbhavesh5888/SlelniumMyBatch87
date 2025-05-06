package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EBayDropDown {

	public static void main(String[] args) throws InterruptedException {


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);//close popup manually
		// write code foe all cetegory on ebay size siaze and text

		//now to selct from dropdown menu
		
		WebElement  dropDown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropDown);
		
		s.selectByContainsVisibleText("Baby");
		Thread.sleep(3000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));

		for(int i=0; i<alloptions.size(); i++) {
			if(alloptions.get(i).isSelected()) {
				System.out.println(alloptions.get(i).getText()+"------is Selected");
			}
		}
		
System.out.println("-----------------------------------------After Selection----------------------------------------------------------------");
		
		
		for(int i=0; i<alloptions.size(); i++) {
			System.out.println(alloptions.get(i).getText()+"-------------"+alloptions.get(i).isSelected());
		}
		
		
	}

}
