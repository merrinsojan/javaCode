package StepDefinitions;


	import cucumber.api.PendingException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceLabHomes;
import pages.SauceLabLogin;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.BaseUtil;

	public class SaucelabLoginStep {
		//SauceLabLogin ent;
		//SauceLabHomes hm;
		 public static WebDriver driver;
		/*private String standard_user;
		private String secret_sauce;
		 public SaucelabLoginStep( String standard_user,String secret_sauce) {
			 this.standard_user=standard_user;
			 this.secret_sauce=secret_sauce;
		 }*/
		
		 @Given("^User is on Home Page$")
		    public void user_is_on_home_page() throws Throwable {
			 SauceLabLogin var1=new SauceLabLogin(driver);
			 System.out.println("login validation");
		    }
		 @When("^User Navigate to LogIn Page$")
		    public void user_navigate_to_login_page() throws Throwable {
		       System.out.println("Saucelab");
		    }
		 @Then("^Enters username and password$")
		    public void enters_username_and_password(DataTable table) throws Throwable {
			 SauceLabLogin ent=new SauceLabLogin(driver);
           //  System.out.println(table);
			// driver.manage().window().maximize();
			ent.EntersLogincredentials(table);
			//Thread.sleep(3000);
			/* List<List<String>> data = table.asLists();
			String standard_user=data.get(1).get(0);
		    String secret_sauce=data.get(1).get(1);
              System.out.println(standard_user);
              System.out.println(secret_sauce);*/
			// ent.EntersLogincredentials(standard_user, secret_sauce);
		    }

		    
		 @Then("verify")
		 public void verify() {
			 String pdt="Products";
			 SauceLabHomes hm=new SauceLabHomes(driver);
			 hm.home(pdt);  
		     System.out.println("verified");
		    }
		 

	
}
