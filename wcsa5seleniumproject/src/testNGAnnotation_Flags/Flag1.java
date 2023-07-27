package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "LoginMethod")
  public void method1() {
	  Reporter.log("method1 from flag1");
  }
  
  
  @Test(description = "LogoutMethod")
  public void method2() {
	  Reporter.log("method2 from flag1");
  }

}
