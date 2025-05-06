package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		File s = driver.getScreenshotAs(OutputType.FILE); //// When use FifeoxDriver, ChromeDriver, SafariDriver
		// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // This line is for WebDriver
		
		//add Common.io jar to project
		FileUtils.copyFile(s, new File("C:\\QA1\\Testing\\screenShot.png"));

	}

}
