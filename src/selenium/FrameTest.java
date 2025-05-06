package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));

		System.out.println("Sortable:"+sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is present");
		}
		else {
			System.out.println("sortable is not present");
		}
		
		System.out.println("------------seccond Test---------");
	
		
		List<WebElement> box = driver.findElements(By.id("draggable"));
		System.out.println("draggable:"+box.size());
		
		
		if(box.size()>0) {
			System.out.println("draggable is present");
		}
		else {
			System.out.println("draggable is not present");
		}
		
		//we have frame to we need to swtich to frame to select draggable
		
		//driver.switchTo().frame(0);//by index
		//driver.switchTo().frame("demo-frame");//by string only for Name or Id,but we dont have that available id or name in this Iframe tag
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//by webelement
		
		System.out.println("--------------after switching frame------------");
		
		//List<WebElement> sortable = driver.findElements(By.linkText("Sortable")); we already declare(List<WebElement> sortable) before so we just have to
		//write sortable = driver.findElements(By.xpath("//a[contains(text(),'Sortable')]"));(cant dublicate the value)
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println("Sortable:"+sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is present");
		}
		else {
			System.out.println("sortable is not present");
		}
		
		System.out.println("------------seccond Test---------");
	
		
		//List<WebElement> box = driver.findElements(By.id("draggable"));  we already declare(List<WebElement> box) before so we just have to
		//write  box = driver.findElements(By.id("draggable"));(cant dublicate the value)
		
		box = driver.findElements(By.id("draggable"));
		
		System.out.println("draggable:"+box.size());
		
		
		if(box.size()>0) {
			System.out.println("draggable is present");
		}
		else {
			System.out.println("draggable is not present");
		}
		
		
		
		
		
		System.out.println("-------------------switching back to main page-------------");
		driver.switchTo().defaultContent(); //to goto main page(out of frame)
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println("Sortable:"+sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable is present");
		}
		else {
			System.out.println("sortable is not present");
		}
		
		System.out.println("------------seccond Test---------");
	
		
		box = driver.findElements(By.id("draggable"));
		
		System.out.println("draggable:"+box.size());
		
		
		if(box.size()>0) {
			System.out.println("draggable is present");
		}
		else {
			System.out.println("draggable is not present");
		}
		
		
		
		
		}

}
