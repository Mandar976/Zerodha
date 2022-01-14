package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	   
	
	@FindBy(xpath="//input[@id=\"userid\"]")private WebElement username;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement password;
    @FindBy(xpath="//button[@type=\"submit\"]")private WebElement login;
    @FindBy(xpath="//img[@src=\"/static/images/kite-logo.svg\"]")private WebElement logo;
    @FindBy(xpath="//a[text()=\"Forgot password?\"]")private WebElement forgetpass;
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	
    }
    public void enterusername(String name) {
    	username.sendKeys(name);
    }
    public void enterpassword(String pass) {
    	password.sendKeys(pass);
    }
    public void clickonlogin() {
    	login.click();
    }
    public void logokite() {
    	logo.isDisplayed();
    	
    }
    public void clickonforgetpass() {
    	forgetpass.click();
    }
}
