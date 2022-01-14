package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callbrowserf {
	
	public static WebDriver Firefox(String Url) {
		System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(Url);
		return driver;
		
		
	}

}
