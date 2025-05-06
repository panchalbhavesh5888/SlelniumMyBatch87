package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		//Home work-1
		//first and last name
		driver.findElement(By.name("firstname")).sendKeys("bhave");
		driver.findElement(By.name("lastname")).sendKeys("panch");
		
		//Home work-2(class5&6)
		//select month july
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		//select date 10
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByVisibleText("10");
		
        //select year 2000
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		
		//phone number and password
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("fadfhhghjgjgfj");
		Thread.sleep(3000);
		
		//Home work-3(class7)

		//click on radio button of gender
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]")).click();
		//driver.findElement(By.xpath("//input[@value='2']")).click();  or we can you this
		
		driver.findElement(By.name("websubmit")).click();

	
 
		
	}

}
