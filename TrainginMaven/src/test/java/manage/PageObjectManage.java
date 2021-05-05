package manage;

import pages.HomePage;
import pages.LoginPage1;

public class PageObjectManage {
	private static LoginPage1 Lp;
	private static HomePage HomePage;
	
	public static LoginPage1 getLoginPage1(){
		Lp=new LoginPage1(WebDriverManage.getWebDriver());
	    return Lp;
	}
	
	public static HomePage getHomePage(){
		HomePage=new HomePage(WebDriverManage.getWebDriver());
	    return HomePage;
	}
}
