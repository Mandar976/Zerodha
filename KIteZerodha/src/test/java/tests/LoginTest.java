package tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import POM.LoginPage;
import Pojo.LaunchBrowser;
import Utilities.Parametrization;
import Utilities.Screenshots;
@Listeners(tests.Listener.class)
public class LoginTest {
	WebDriver driver;
	static Logger log = Logger.getLogger(LoginTest.class.getName());

	@BeforeMethod
	public void LaunchBrowser() {
		driver = LaunchBrowser.OpenBrowser();
		log.info("start test");
	}

	@Test
	public void entervalidcredentinals1() throws InterruptedException, EncryptedDocumentException, IOException, FileNotFoundException {
		LoginPage pom = new LoginPage(driver);
		String username = Parametrization.getdata(0, 0);
        pom.enterusername("iojijij");
//        log.info(username);
        String password = Parametrization.getdata(1, 1);
        pom.enterpassword(password);
//        log.info("roahn");
        pom.clickonlogin();
        pom.clickonforgetpass();
        pom.logokite();
        Screenshots.Screenshot("Rohan Sanas ", driver);
        
	}

}
