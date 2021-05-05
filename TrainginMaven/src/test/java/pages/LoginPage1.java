package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import manage.PageObjectManage;

public class LoginPage1 {
WebDriver driver;
/*private BaseUtil base;
public LoginPage1(BaseUtil base) {
this.base = base;
}*/

public LoginPage1(WebDriver driver) {
this.driver=driver;
    PageFactory.initElements(driver, this);
}

@FindBy(how=How.NAME,using="user-name")
WebElement username;
@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//input[@id='login-button']")
WebElement submit;

public void GetURL() {
//driver=base.getDriver();
 driver.get("https://www.saucedemo.com/");  
 driver.manage().window().maximize();
   
}
public void Login(String firstname,String lastName) {
username.sendKeys(firstname);
password.sendKeys(lastName);
submit.click();

}


}