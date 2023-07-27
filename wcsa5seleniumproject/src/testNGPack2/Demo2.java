package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void method3() {
	  Reporter.log("This is Method3", true);
  }
  
  @Test
  public void method4()
  {
	  int i=10;
	  int j=15;
	  int res=j/i;
	  Reporter.log("This is Method4", true);
	  
  }
}
