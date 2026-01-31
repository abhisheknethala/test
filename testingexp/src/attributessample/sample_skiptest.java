package attributessample;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class sample_skiptest {
	boolean flag=false;
  @Test
  public void f() {
	  if(flag)// {
		  throw new SkipException("hii skip testcase method");
	 // }
		  System.out.println("abhi");
  }
}
