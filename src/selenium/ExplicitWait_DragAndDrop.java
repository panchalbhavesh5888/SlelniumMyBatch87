package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://jqueryui.com/droppable/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText()); //Drop here
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		wait.until(ExpectedConditions.textToBePresentInElement(droppable, "Dropped!"));
		System.out.println(droppable.getText()); //Dropped!
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}

}
