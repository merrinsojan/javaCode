package StepDefinitions;


import io.cucumber.core.api.Scenario;
import manage.PageObjectManage;
import pages.HomePage;
import pages.LoginPage1;

public class PageInitStepDef {
	Scenario scenario;
	LoginPage1 LpI;
	HomePage HpI;
	public PageInitStepDef(SharedClassStepDef sh) {
		LpI=PageObjectManage.getLoginPage1();
		HpI=PageObjectManage.getHomePage();
		scenario=sh.getScenario();
	}
}