package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features_with_tags"
		,glue= {"stepdefinition"},monochrome=true,tags="@run"
		//plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"}
		)




public class testrunnertags {

}
