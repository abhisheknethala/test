package sam_assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sam_soft_asser {
  @Test
  public void f() {
	  SoftAssert obj = new SoftAssert();
	  obj.assertEquals("abhi", "roy");
	  obj.assertTrue(100<3,"i am failing");
	  
	  obj.assertAll();
  }
}
