package cucumber_testRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
features = "src/main/java/feature/",
dryRun = false,
glue = "stepDefinition" )



public class CucumberRunner {
	
	
	
	
	

}
