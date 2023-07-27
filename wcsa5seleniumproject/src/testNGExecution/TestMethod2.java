package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
  @Test
  public void testMethod3() {
	  long threadId3 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod1 :"+threadId3);
  }
  
  @Test
  public void testMethod4()
  {
	  long threadId4 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testMethod1 :"+threadId4);
  }
}
