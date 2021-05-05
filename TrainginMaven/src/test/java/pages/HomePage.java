package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
WebDriver driver;

public HomePage(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[contains(text(),'Products')]")
WebElement products;
public void verify() throws Exception {
 
String Actual=products.getText();
String Expt="products";
if( Actual.equalsIgnoreCase(Expt)) {
System.out.println("Verified");
 }

 else {
 System.out.println("failed");
 }
}}