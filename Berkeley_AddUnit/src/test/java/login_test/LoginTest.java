package login_test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import berkeley.APN_addition.APN_Find;
import berkeley.APN_addition.Citizen_APN_add;
import berkeley.APN_addition.Login;
import berkeley.APN_addition.MainClass;
import berkeley.APN_addition.VerifyHomepage;

public class LoginTest extends MainClass{
	MainClass mainClass;
	VerifyHomepage hp;
	Login login;
	APN_Find apnFind;
	Citizen_APN_add citiAPNadd;
	
	@SuppressWarnings("static-access")
	@BeforeClass
	public void mainclass() throws IOException, InterruptedException {
		mainClass = new MainClass();
		mainClass.main(null);
		Thread.sleep(5000);
	}
	
	
	@Test (priority = 1)
	public void homepage() {
		hp = new VerifyHomepage();
		hp.verifyHomepg();
		try {
			Assert.assertEquals(VerifyHomepage.title, VerifyHomepage.actualTitle, "Homepage verified");
			Reporter.log("Verified");
		} catch (AssertionError e) {
			Reporter.log("Failed");
			throw e;
		}
	}
	
	@Test (priority = 2)
	public void loginTest() throws InterruptedException {
		login = new Login();
		login.verifyLogin(prop.getProperty("staffemail"), prop.getProperty("staffpassword"));
		Reporter.log("Login Success!");
	}
	
	@Test (priority = 3)
	public void findAPN() throws InterruptedException {
		apnFind= new APN_Find();
		apnFind.findAnAPN();
	}
	
	@Test (priority = 4)
	public void loginTest1() throws InterruptedException {
		login = new Login();
		login.verifyLogin(prop.getProperty("citizenemail"), prop.getProperty("citizenpassword"));
		Reporter.log("Login Success!");
	}
	
	@Test (priority = 5)
	public void APN_CitizenAdd() throws InterruptedException, IOException {
		citiAPNadd = new Citizen_APN_add(null);
		citiAPNadd.citizenAPNadd();
	}
	
	@AfterClass
	public void close() throws InterruptedException  {
		Thread.sleep(100000);
		driver.quit();
	}
}
