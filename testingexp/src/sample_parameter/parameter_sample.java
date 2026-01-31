package sample_parameter;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;



public class parameter_sample {
  @Test
  @Parameters("Name")
  public void f(String Name) {
	  System.out.println("i am abhi"+ Name);
  }
}
