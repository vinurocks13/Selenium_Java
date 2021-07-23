package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	//xpath's for elements:
	@FindBy(xpath = ("//span[contains(.,'Rent Registry')]")) public static WebElement logoText;
	@FindBy(xpath = ("//img[@src='assets/img/rent-img.png']")) public static WebElement homepageImg;
	@FindBy(xpath = ("//div[contains(text(),'Login')]")) public static WebElement loginText;
	@FindBy(xpath = ("//input[@aria-label='Email Address']")) public static WebElement email;
	@FindBy(xpath = ("//input[@aria-label='Password']")) public static WebElement password;
	@FindBy(xpath = ("//button/span[contains(text(),'Login')]")) public static WebElement loginButton;
	@FindBy(xpath = ("//li/h3[contains(text(),'Preparing')]")) public static WebElement preparingForRegistration;
	@FindBy(xpath = ("//li[@class=\"ng-star-inserted\"]")) public static List<WebElement> gridPage;
	@FindBy(xpath = ("//td[@aria-colindex='1']/a[@class='anchor-color cursor-pointer ng-star-inserted']")) public static WebElement apnColumnlist;
	@FindBy(xpath = ("//span/mat-icon[contains(text(),'pin')]")) public static WebElement viewApn;
	@FindBy(xpath = ("//span[contains(text(),'Property Actions')]")) public static WebElement propertyActions;
	@FindBy(xpath = ("//button[contains(text(),'Show')]")) public static WebElement showPin;
	@FindBy(xpath = ("//p[contains(text(),'APN')]")) public static WebElement apn_pin;
	@FindBy(xpath = ("//button/span[contains(text(),'Close')]")) public static WebElement closeAPN_PIN;
	@FindBy(xpath = ("(//button/span/mat-icon[contains(text(),'close')])[2]")) public static WebElement closeAPNPopUP;
	@FindBy(xpath = ("//a[@class=\"portal-user-menu-button mat-button ng-star-inserted\"]")) public static WebElement userMenu;
	@FindBy(xpath = ("//div//span[text()='Sign Out']")) public static WebElement signout;
	@FindBy(xpath = ("//button[@class=\"mat-raised-button mat-primary\"]")) public static WebElement addProperty;
	
}
