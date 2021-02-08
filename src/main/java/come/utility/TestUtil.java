package come.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.TestBaseClass;

public class TestUtil extends TestBaseClass {

	
	
	
	public static  long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT=10;
	
	public void switchtoFrame() {
		driver.switchTo().frame("keyframes");
	}
//	public static void takeScreenshotAtEndOfTest() throws IOException {
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//		}
}
