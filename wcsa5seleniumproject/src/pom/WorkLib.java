package pom;

public class WorkLib extends BaseTest {
	
	public void handleConfirmationPopUp()
	{
		driver.switchTo().alert().accept();
	}

}
