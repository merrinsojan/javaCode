package manage;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManage {

	
   public static WebDriver driver;
   public static WebDriver getWebDriver() {
        if (driver == null) {
            resetWebDriver();
        }
        return driver;
    }


	private static void resetWebDriver() {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();
       /*  options.addArguments("--ignore-ssl-errors=yes");
       options.addArguments("--ignore-certificate-errors");
       options.addArguments("--no-sandbox");
       options.addArguments("--headless");
       options.addArguments("--window-size=1920,1080");
       options.addArguments("--disable-dev-shm-usage");
       options.addArguments("start-maximized"); // open Browser in maximized mode
       options.addArguments("disable-infobars"); // disabling infobars
       options.addArguments("--disable-extensions"); // disabling extensions
       options.addArguments("--disable-gpu"); // applicable to windows os only
      */
       LoggingPreferences logPrefs = new LoggingPreferences();
       logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
       options.setCapability("goog:loggingPrefs", logPrefs);
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver(options);
       try{
           driver.manage().window().maximize();
       }
       catch(Exception e){
       } 
       }

}






