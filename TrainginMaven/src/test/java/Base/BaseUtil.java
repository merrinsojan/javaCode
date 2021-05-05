package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import pages.HomePage;
import pages.LoginPage1;

public class BaseUtil {

protected WebDriver driver;
LoginPage1 Lpi;
HomePage Hp;
public LoginPage1 getLpi() {
return Lpi;
}

public void setLpi(LoginPage1 lpi) {
Lpi = lpi;
}

@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
   System.setProperty("webdriver.chrome.driver", "D:\\selenium-merrin\\driver\\chromedriver.exe") ;
         driver=new ChromeDriver();
         Lpi=new LoginPage1(driver);
         
       
    }

public WebDriver getDriver() {
return driver;
}



}