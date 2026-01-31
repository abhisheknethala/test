package attributessample;

import org.testng.annotations.Test;

public class attr_demo {
  @Test(enabled=false)
  public void f() {
	  System.out.println("i am abhi");
  }
  @Test
  public void f2() {
	  System.out.println("i am roy");
  }
  @Test(timeOut=200)
  public void f3() throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("i am happy");
  }
  @Test(description="this is dillu")
  public void f4() {
	  System.out.println("he is happy");
  }
}
