package attributessample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class sample_dif_grp {
  @Test(groups= {"abhi"})
  public void f() {
	  System.out.println("i am abhishek");
  }
  @Test(groups= {"abhi"})
  public void f2() {
	  System.out.println("i am from tadepalligudem");	  
  }
  @Test
  public void f3() {
	  System.out.println("i am from tadepalligudem3");	  
  }
  @Test(groups= {"place"})
  public void f4() {
	  System.out.println("i am from tadepalligudem4");	  
  }
  @Test(groups= {"place"})
  public void f5() {
	  System.out.println("i am from tadepalligudem5");	  
  }
  @BeforeGroups(groups= {"abhi,place"})
  public void f6() {
	  System.out.println("before groups");
  }
  @AfterGroups(groups= {"abhi,place"})
  public void f7() {
	  System.out.println("after groups");
  }
  }

