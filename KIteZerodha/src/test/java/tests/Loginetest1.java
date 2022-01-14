package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(tests.Listener.class)
public class Loginetest1 {

	@Test
	public void logintest() {
		System.out.println("Hello Java");

	}

	@Test
	public void logintest1() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}

	@Test(dependsOnMethods = "logintest1")
	public void logintest2() {
		System.out.println("Test2");
	}
}
