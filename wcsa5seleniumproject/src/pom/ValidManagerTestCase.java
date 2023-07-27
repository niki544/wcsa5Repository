package pom;

import java.io.IOException;

public class ValidManagerTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UsersPage up = new UsersPage(driver);
		
		//perform  valid login
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		
		//click on users module
		hp.clickOnusersModule();
		
		//create the manager
		up.createManager(flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3));
		
		//delete user
		up.deleteManager();
		WorkLib.handleConfirmationPopup();
		
		Thread.sleep(2000);
		bt.tearDown();

		
		
	}

	

}
