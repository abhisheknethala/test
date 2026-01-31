package attributessample;

import org.testng.annotations.Test;

public class attr_timeout {
  @Test(timeOut=200)
  public void f() throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("i am happy");
  }
}
