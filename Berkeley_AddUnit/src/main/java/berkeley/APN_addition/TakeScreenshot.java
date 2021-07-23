package berkeley.APN_addition;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot extends MainClass{
	public static TakesScreenshot screenShot;
	public static File source;
	
	public static void takeScreenShot() throws IOException {
		Random randomss = new Random();
		screenShot = (TakesScreenshot)driver;
		source = screenShot.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./ScreenShots/"+"screenShot_"+randomss.nextInt()+".png"));
	    System.out.println("Screenshot - Kachak");
	}
}	
