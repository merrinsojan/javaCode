package StepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import manage.WebDriverManage;

public class SharedClassStepDef {
	
	public static Scenario scenario;
	@Before
    public void initial(Scenario scenario) throws Exception{
       this.scenario=scenario;
        WebDriverManage.getWebDriver();
}

	public static Scenario getScenario()
	{
		return scenario;
	}
	}
