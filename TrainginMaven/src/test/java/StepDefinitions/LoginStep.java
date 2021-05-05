package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends PageInitStepDef {
	
public LoginStep(SharedClassStepDef sh) {
		super(sh);

	}

@Given("User is on the login page")
public void user_is_on_the_login_page() {

  LpI.GetURL();
}

@When("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
public void user_enters_username_something_and_password_something(String username, String password) throws Throwable {
    
//String username = "standard_user"; 
//String password = "secret_sauce";
LpI.Login(username, password);
}

@And("user click on login button")
public void user_click_on_login_button() {
System.out.println("click");
}

@Then("^Verification of login page$")
public void verification_of_login_page() throws Throwable {
//System.out.println("value"+basut.stepInfo);
	 String pdt="Products";
	HpI.verify();
	 scenario.write("This goes into the report(s)\n");   
System.out.println("ok");

}

}