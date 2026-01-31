package testing_exp_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("----first test case-----");
  }
  @Test
  public void f2() {
	  System.out.println("----second test case-----");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("---before method-----");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("----after method-----");
	
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("----- after test----");
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("----- before test----");
  }
  @BeforeClass
	  public void beforeclass() {
		  System.out.println("-----  beforeclass----");
	  }
  @AfterClass
  public void afterclass() {
	  System.out.println("-----  afterclass ----");
  }
 @BeforeSuite
  public void beforesuite() {
	  System.out.println("-----  before suite ----");
  }
 @AfterSuite
 public void aftersuite() {
	  System.out.println("-----  after suite ----");
 }
 @BeforeGroups
 public void beforegroups() {
	  System.out.println("-----  before groups ----");
 }
 @AfterGroups
 public void aftergroups() {
	  System.out.println("-----   after groups ----");
 }
  
  }
  


