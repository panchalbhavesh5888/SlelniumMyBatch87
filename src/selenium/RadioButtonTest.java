package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(3000);
		
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radio.size());
		
		//Part-1
		//here we like ot get text but there is nolink and  so we have to use getAttribute()..
		/*
		for(int i=0; i<radio.size(); i++) {
			System.out.println(radio.get(i).getAttribute("value"));
		}
	   */
		
		//or
		
		for(WebElement a : radio) {
			System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
		}
		
		
		//part-2
		
		System.out.println("----------------now test2: for clicking cheese-------------");
	
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		for(WebElement a : radio) {
			System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
		}
		
		
		//part-3 <<Home Work>>
		//print only selected HomeWork
		
		System.out.println("-------------Hume Work------------");
		
		driver.findElement(By.xpath("//input[@value='Butter']")).click();

		for(WebElement a : radio) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
			}
		}
		
		
		System.out.println("----------------now test2: for clicking cheese-------------");
	
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		for(WebElement a : radio) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+"-----------"+a.isSelected());
			}
		}
		
	}

}
