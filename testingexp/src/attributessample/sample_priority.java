package attributessample;

import org.testng.annotations.Test;

public class sample_priority {
  @Test(priority=6)
  public void f() {
	  System.out.println("i am abhi");
  }
  @Test(priority=5)
  public void f1() {
	  System.out.println("i am roy");
  }
  @Test
  public void f3() {
	  System.out.println("i am dillu");
  }
}
