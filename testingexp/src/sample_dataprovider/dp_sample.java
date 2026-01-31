package sample_dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dp_sample {
 @DataProvider(name="abhi")
 public Object[][] dataProviderMethod(){
      return new Object[][] {{"1.roy"},{"2.dillu"},{"3.ajay"}};
 }
 @Test(dataProvider = "abhi")
 public void testMethod(String data) {
	 System.out.println(data);
 }
}
