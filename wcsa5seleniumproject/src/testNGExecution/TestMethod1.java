package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
	  long threadId1 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod1 :"+threadId1);
  }
  
  @Test
  public void testMethod2()
  {
	long threadId2 = Thread.currentThread().getId();  
	
	Reporter.log("thread id of testMethod1 :"+threadId2);
  }
}
