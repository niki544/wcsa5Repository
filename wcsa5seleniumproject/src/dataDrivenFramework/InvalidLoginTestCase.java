package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-0ae2i98/login.do;jsessionid=bi7iaoacrok3");
		
		Thread.sleep(2000);
		
		// read the data from excel file and test the login page
		
		Flib flib = new Flib();
		
		//to read multiple data use for loop
		int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx", "InvalidCreds");
		for(int i=1; i<=rc; i++)
		{
		
		//String InvalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx", "InvalidCreds", i, 0);
		//String InvalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "InvalidCreds", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "InvalidCreds", i, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "InvalidCreds", i, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
		}
	}

	
	}


