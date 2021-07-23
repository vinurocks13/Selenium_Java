package berkeley.APN_addition;

import utilities.Locators;

public class Login extends MainClass {
	public void verifyLogin(String email, String password) throws InterruptedException {
		
		// logging in
		Locators.email.sendKeys(email);
		Locators.password.sendKeys(password);
		Locators.loginButton.click();
		
		Thread.sleep(1000);
		System.out.println("Login Successfull");
		Thread.sleep(1000);
	}
	
}
