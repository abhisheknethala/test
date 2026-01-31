package attributessample;

import org.testng.annotations.Test;

public class sample_depnd {
  @Test(timeOut=200)     //(enabled=false)
  public void f()throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("i am abhi");
  }
  @Test       //(timeOut=200)
  public void f1()throws InterruptedException {
	  Thread.sleep(500);
	  System.out.println("i am roy");
  }
  @Test(dependsOnMethods= "f")
  public void f2() {
	  System.out.println("i am dillu");
  }
}
