package sam_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sam_hard_asser {
  @Test
  public void f() {
	  String ActualOutput = "abc";
	  String ExpectedOutput="xyz";
	  Assert.assertEquals(ActualOutput, ExpectedOutput);
	  Assert.assertTrue(5<3,"failed message");
	  Assert.fail("i am again failing");
	  
	 System.out.println("i am there");
	 Assert.fail("i am failing");
	 System.out.println("i am not running");
  }
}
