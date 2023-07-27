package testNGAnnotation_Flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
  @Test
  public void search1() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void search2() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("Sql",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @Test
  public void search3() throws InterruptedException
  {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
}
