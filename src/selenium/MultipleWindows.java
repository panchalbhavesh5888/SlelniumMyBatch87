package selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=AVdkyDlTeB8y9Ts8dxskW9kga8SCyrfabcxmPaREf303vNK4eBjZJMk7kspEgUzSfbBT79jrsQkK6g&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-601638168%3A1736608603633506&ddm=1");
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator<String> itr = windows.iterator();
		String mainWindow =itr.next();
		String privacy= itr.next();
		String help=itr.next();
		
		
	//	System.out.println("main window handle"+mainWindow );
	//	System.out.println("childwindow handle"+privacy );
	//	System.out.println("childwindow handle"+help );

		
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());//title for gmail page
		driver.switchTo().window(privacy);
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); // title for help oage
	//	driver.close(); //to close just perticular window and can continue to use driver after calling close.
		Thread.sleep(3000);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());//title for gmail page
		driver.switchTo().window(help);
		System.out.println(driver.getTitle()); // title for help oage
		Thread.sleep(3000);

		
		
		driver.quit(); //will close all windoew open by current browser(driver),kill the driver and use driver after quit

		
		}

}
