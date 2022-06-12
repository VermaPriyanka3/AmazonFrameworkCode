package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun=true,
		features = "src/test/java/feature" , 
		glue = {"src/stepdefiniton"}
		)
public class TestRun {

}
