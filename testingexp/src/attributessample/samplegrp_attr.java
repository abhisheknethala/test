package attributessample;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class samplegrp_attr {
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
  @Test(groups= {"abhi"})
  public void f4() {
	  System.out.println("i am from tadepalligudem4");	  
  }
  @Test(groups= {"abhi"})
  public void f5() {
	  System.out.println("i am from tadepalligudem5");	  
  }
  @BeforeGroups(groups= {"abhi"})
  public void f6() {
	  System.out.println("before groups");
  }
  @AfterGroups(groups= {"abhi"})
  public void f7() {
	  System.out.println("after groups");
  }
  }

