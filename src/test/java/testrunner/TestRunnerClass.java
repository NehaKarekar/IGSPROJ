package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
	features= {"Feature"},
	glue= {"stepdef"},
	dryRun =false,
	monochrome=true,
     plugin= {"html:Reports/Eligibility.html"}
		)

public class TestRunnerClass {
	
	}

	

	

	


