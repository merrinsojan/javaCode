package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = {"src/test/java"},glue={"StepDefinitions","pages","Hooks"},tags = {"@tage9 "} ,monochrome = true)

//tags = {"@tage9 or @smoke"}	 

		public class TagTestRunner extends AbstractTestNGCucumberTests {

		 

		

}
