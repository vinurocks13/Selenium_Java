package berkeley.APN_addition;

public class VerifyHomepage extends MainClass {
	public static String title;
	public static String actualTitle;
	
	public void verifyHomepg() {
		title = driver.getTitle();
		actualTitle = prop.getProperty("title");
	}
}
