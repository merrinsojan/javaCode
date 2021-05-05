package pages;


import cucumber.api.PendingException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Hooks.sauceLabHooks;

public class SauceLabHomes extends sauceLabHooks {
	WebDriver driver;
	public SauceLabHomes(WebDriver driver){
		  this.driver=driver;
		  PageFactory.initElements(driver, SauceLabHomes.class);
		  }
public void home(String pdt)  {
	WebElement products=driver.findElement(By.xpath("//span[@class='title']"));
 	String Actual=products.getText();
 	
 	if( Actual.equalsIgnoreCase(pdt)) {
 	System.out.println("login successfull");
 	}
 	else {
 		System.out.println("login fail");
 	}
}		

}