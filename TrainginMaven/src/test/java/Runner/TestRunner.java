package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			  features = {"src/test/java"},glue={"StepDefinitions"}
			  
)

			public class TestRunner extends AbstractTestNGCucumberTests{
//		@AfterClass
//		public static void writeExtentReport() {    
//			Reporter.loadXMLConfig(new File("src\\test\\resources\\extent.config.xml"));
//			}

			
	}