package berkeley.APN_addition;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Locators;

public class APN_Find extends MainClass{
	public static String APN;
	public static String PIN;
	public Random randomSelect;
	
	public void findAnAPN() throws InterruptedException {
		Thread.sleep(2000);
//		driver.findElement(By.xpath(prop.getProperty("preparingForRegistration"))).click();
		Locators.preparingForRegistration.click();
		
		//Click on any grid page of Preparing for Registration page
		Random randomSelect = new Random();
//		List<WebElement> grid = driver.findElements(By.xpath(prop.getProperty("gridPage")));
		List<WebElement> grid = Locators.gridPage;
		grid.get(randomSelect.nextInt(10)).click();
		
		//Click any APN from the list of Preparing for Registration page
		List<WebElement> RRcase = driver.findElements(By.xpath(prop.getProperty("apnColumnlist")));
		RRcase.get(randomSelect.nextInt(10)).click();
		
		//Find APN PIN from Property Actions menu on APN
		driver.findElement(By.xpath(prop.getProperty("viewAPN"))).click();
		driver.findElement(By.xpath(prop.getProperty("propertyActions"))).click();
		driver.findElement(By.xpath(prop.getProperty("showPIN"))).click();
		String apn_pin = driver.findElement(By.xpath(prop.getProperty("apn_pin"))).getText();
		String apnpin[] = apn_pin.split(" ");
		String APN2 = apnpin[1];
		String APN1[] = APN2.split("P");
		APN = APN1[0];
		System.out.println("APN: " + APN);
		PIN = apnpin[2];
		System.out.println("PIN: " + PIN);
		Thread.sleep(500);
		
		//Close APN PIN popup and logout
		driver.findElement(By.xpath(prop.getProperty("closeAPN_PIN"))).click();
		driver.findElement(By.xpath(prop.getProperty("userMenu"))).click();
		driver.findElement(By.xpath(prop.getProperty("signOut"))).click();
	}
	
}
