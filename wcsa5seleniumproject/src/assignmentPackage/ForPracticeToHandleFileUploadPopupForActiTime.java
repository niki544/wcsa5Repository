package assignmentPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForPracticeToHandleFileUploadPopupForActiTime {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-0ae2i98/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption'] ")).click();
		
		WebElement uploadbutton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(uploadbutton).perform();
		
		Thread.sleep(2000);
		
		File file = new File("./autoitPrograms/FileUpload2InActiTime");
	    String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abs);
		Thread.sleep(2000);
		
		
	}

}
