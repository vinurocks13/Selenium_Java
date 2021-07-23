package berkeley.APN_addition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainClass {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream propFile;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Apps\\eclipse-java-2020-12-R-win32-x86_64\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("E:\\Apps\\ungoogled-chromium_87.0.4280.141-1.1_windows-x64\\ungoogled-chromium_87.0.4280.141-1.1_windows\\chrome.exe");
		driver = new ChromeDriver(opt);
//		Thread.sleep(1000);
		propFile = new FileInputStream(".\\data.properties");
		prop = new Properties();
		prop.load(propFile);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
