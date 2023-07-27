package pom;

import java.io.IOException;

public class ValidLoginTestCasee extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		//to call the webelementsoof the login page create the object of loginpage class
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
		//use homepage elements create obj of homepage POM
		HomePage hp = new HomePage(driver);
		hp.clickOnlogOutLink();
		
		
	}
	
	

}
