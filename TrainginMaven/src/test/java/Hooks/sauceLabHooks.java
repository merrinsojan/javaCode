package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import StepDefinitions.SaucelabLoginStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SauceLabHomes;
import pages.SauceLabLogin;

public class sauceLabHooks extends SaucelabLoginStep {
   WebDriver driver;
   
	@Before
	public void InitializeTest() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-merrin\\driver\\chromedriver.exe") ;  
		driver= new ChromeDriver();
		SauceLabHomes var=new SauceLabHomes(driver);
		SauceLabLogin var1=new SauceLabLogin(driver);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
	}
	@After
	public void TearDownTest() {
		driver.close();
	}
	
}
