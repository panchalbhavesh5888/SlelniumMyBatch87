package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		Thread.sleep(3000);// TODO Auto-generated method stub

		driver.findElement(By.name("B2")).click();
		
	// first make sure its javascript alert or html alert(by inspecting element, if cant inspect then its javascript alert)
	 //then write code to switch to alert. driver.switchTo().alert(); but its Alart class object to create object of Alert class
	//driver.switchTo().alert();	

		Alert al = driver.switchTo().alert(); 
		System.out.println(al.getText());
		
		al.accept(); // click on selected button
	//	al.dismiss();//click on non selected button
		
		driver.findElement(By.name("B1")).click();
		Thread.sleep(3000);
		
		al= driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);
		
		al= driver.switchTo().alert();
		//al.accept();
		al.dismiss();
		
	
		driver.findElement(By.name("B3")).click();
		Thread.sleep(3000);
		
		al= driver.switchTo().alert();
		al.sendKeys("bhavrs");
		Thread.sleep(3000);
		al.accept();
		
	}

}
