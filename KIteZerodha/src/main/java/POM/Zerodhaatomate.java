package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaatomate {

	@FindBy(xpath = "//input[@id=\"userid\"]")private WebElement username;
	@FindBy(xpath = "//input[@id=\"password\"]")private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement submit;
	@FindBy(xpath = "//input[@id=\"pin\"]")private WebElement pin;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement cont;
	@FindBy(xpath = "//img[@alt=\"Kite\"]")private WebElement logo;
	@FindBy(xpath = "//a[@class=\"text-light forgot-link\"]")private WebElement forgot;
	@FindBy(xpath = "//h2[text()='Login to Kite']")private WebElement logintext;
	@FindBy(xpath = "//input[@type=\"text\"]")private WebElement search;
	@FindBy(xpath = "//span[text()='PMCFIN']")private WebElement stockname;

	public Zerodhaatomate(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	public void enterusename(String name) {
		username.sendKeys(name);}
	public void enterpassword(String pass) {
		password.sendKeys(pass);}
	public void clickonsubmit() {
		submit.click();}
	public void enterpin(String pins) {
		pin.sendKeys(pins);}
	public void clickoncontinue() {
		cont.click();}
	public boolean logovisible() {
		return cont.isDisplayed();}
	public boolean forgettag() {
		return forgot.isDisplayed();}
	public boolean logintextvisible() {
		return logintext.isDisplayed();}
	public void enterstockname(String stockname) {
		search.sendKeys(stockname);}
	public void clickonstock() {
		stockname.click();}

}
