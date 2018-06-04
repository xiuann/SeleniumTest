package cucumber_testRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/feature"
		,glue={"src/main/java/stepDefinition"}
		)


public class CucumberRunner {
	
	
	
	
	

}
