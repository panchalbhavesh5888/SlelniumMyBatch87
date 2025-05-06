package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //Max wait time. it is not applicalbe for all the line below this line.it is only applicable for perticulr line 
		
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.alertIsPresent()); //em=xplicitwait is only applicable for this line
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
	}

}
