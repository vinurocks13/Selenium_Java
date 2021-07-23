package berkeley.APN_addition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Locators;

public class Citizen_APN_add extends MainClass{
	public Citizen_APN_add(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void citizenAPNadd() throws InterruptedException, IOException {
		Thread.sleep(3000);
//		driver.findElement(By.xpath(prop.getProperty("addProperty"))).click();
		Locators.addProperty.click();
		driver.findElement(By.xpath(prop.getProperty("resetButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("APNfield"))).sendKeys(APN_Find.APN);
		driver.findElement(By.xpath(prop.getProperty("PINfield"))).sendKeys(APN_Find.PIN);
		TakeScreenshot.takeScreenShot();
	}
}
