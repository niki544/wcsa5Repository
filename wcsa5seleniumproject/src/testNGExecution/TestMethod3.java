package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
  @Test
  public void testMethod5() {
	 long threadId5 = Thread.currentThread().getId();
	 
	 Reporter.log("thread id of testMethod1 :"+threadId5);
  }
  
  @Test
  public void testMethod6()
  {
	  long threadId6 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod1 :"+threadId6);
  }
}
