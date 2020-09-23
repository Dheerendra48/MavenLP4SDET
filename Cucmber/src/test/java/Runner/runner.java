package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src/test/resources/Login/login.feature"},
	glue={"StepDefinition"},
	tags = "@Login",//"@Negative",
	dryRun=false,//To check weather you have missed an steps in the scenarios
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check whether any step is not defined in step definition
	plugin = {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
	

	)
public class runner {

}
