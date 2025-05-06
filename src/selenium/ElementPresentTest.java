package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {

		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//can not verify if webelement is present or not, unsing WebElement. WebElement must be present
		//webelement will not work if element is not present it will says "unable to find the element so we will use List
		/*if(driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element Not Present");
		} */
		
		//so we use List to verify element is present or not
		
		//Here output will be Element Present
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element Not Present");
		}
		/*//here output will be Element not Present
		List<WebElement> element = driver.findElements(By.linkText("hgsdfhhfhd"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Element Not Present");
		}
		*/
		
		
		
	}

}
