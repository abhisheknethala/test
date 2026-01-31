package sample_listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.annotations.Test;

public class listener_sample implements ITestListener {
	
  public void onTestFailure(ITestResult result) {
	  System.out.println("failed");
	  System.out.println(result.getName());
	  System.out.println(result.getStatus());
  }
  public void onTestSuccess(ITestResult result) {
	  System.out.println("test case pass");
  }
}
