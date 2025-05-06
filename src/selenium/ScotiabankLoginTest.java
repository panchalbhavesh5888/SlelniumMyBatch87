package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiabankLoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream fi = new FileInputStream("C:\\QA1\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fi);
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=AV635yMg7fM&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQVY2MzV5TWc3Zk0iLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTczNTA2MTQzNiwiaWF0IjoxNzM1MDYwMjM2LCJqdGkiOiJjY2E2ODA1Zi05YzM0LTRmNjctODQ1NS02YmJiMjJjNDA0YTAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.rsFH7xU2cn8JsEVsKOwZOmwmiD-3jjPNDhWJb_D9OKmtF9ZN0Zj6nrzU-5imc--POGrXGYiex3c-jsTXakebOfEgoBCHCI9Il-98ywcK_rouWBlWUm6M06mIZ1PUfACO3KyDVCbjT7CREYqPS6PqtQQ2HiyLoMQ0HE72286d0-O05-xKpkfWr99yfoaPefvOH4EWEW3kCdE7Xko8zYLAK4iw8HgY-3fq1yiI_zXbwJOE7ZC6r7wSYoWTnjMUp0J5f4fXGfpgv_uS9pXW4_8SUdsrNUmHkU2Iwz1NMiwuLfs1oN4x7jwnoT4xNk2C7frsELFBOmnqIcKdHlOu5RrpqA&preferred_environment=");
		//Thread.sleep(8000);
		
		
		driver.findElement(By.id("usernameInput-input")).sendKeys(prop.getProperty("incorrectemail"));
		driver.findElement(By.id("password-input")).sendKeys(prop.getProperty("incorrectpass"));
		Thread.sleep(2000);
	//	driver.findElement(By.id("signIn")).click();
		JavascriptExecutor jse = driver; //USING jacascriptexecuter we dont have to worry about closing pop-up is will navigate to element automatickaly
		jse.executeScript("arguments[0].click();", driver.findElement(By.id("signIn")));		
		Thread.sleep(2000);
		
		String expectederr = prop.getProperty("expectederrmessage");
		String actualerr =driver.findElement(By.xpath("//div[@id='UsernameTextField__errors-usernameInput']/div[1]/div[1]/span[2]")).getText();
		System.out.println(actualerr);
		 
		if(expectederr.equals(actualerr)) {
			System.out.println("test passs");
		}else
		{
			System.out.println("test fail");
		}
	
	}

}
