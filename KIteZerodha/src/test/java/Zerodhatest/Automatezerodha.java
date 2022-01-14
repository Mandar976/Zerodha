package Zerodhatest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.Zerodhaatomate;
import Pojo.Callbrowserf;
import Utilities.Screenshotkite;

public class Automatezerodha {
	WebDriver driver;

	@BeforeClass
	public void lunchbrowser() {

		driver = Callbrowserf.Firefox("https://kite.zerodha.com/");

	}

	@Test
	public void chechpage() throws InterruptedException {
		Zerodhaatomate pom = new Zerodhaatomate(driver);
		System.out.println(pom.forgettag());
		System.out.println(pom.logovisible());
		System.out.println(pom.logintextvisible());
		pom.enterpassword("Velocity@123");
		pom.enterusename("DAA677");
		pom.clickoncontinue();
		pom.enterpin("866918");
		pom.clickoncontinue();
		Thread.sleep(5000);
		pom.enterstockname("pmcfin");
		pom.clickonstock();
	}
	@AfterClass
	public void Screenshotss() throws IOException {
		Screenshotkite.Screen(driver, "Kite");
	}
	
	}


