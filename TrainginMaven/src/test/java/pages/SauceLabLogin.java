package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hooks.sauceLabHooks;
import general.functions;
import io.cucumber.datatable.DataTable;

public class SauceLabLogin extends sauceLabHooks {
	WebDriver driver;
	public SauceLabLogin(WebDriver driver){
		  this.driver=driver;
		  PageFactory.initElements(driver, SauceLabLogin.class);
		  }
	  @FindBy(xpath="//input[@id='user-name']")
	  WebElement standard_user1;
	  @FindBy(xpath="//input[@id='password']")
	  WebElement password;

	public void EntersLogincredentials(DataTable table ) {
		
		List<List<String>> data = table.asLists();
		String standard_user=data.get(1).get(0);
	    String secret_sauce=data.get(1).get(1);
        System.out.println(data.get(1).get(0));
        System.out.println(secret_sauce);  
	
         // standard_user1.click();
          standard_user1.sendKeys(standard_user);
		//WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(secret_sauce);
		
		   
		}
	
}
