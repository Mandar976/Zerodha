package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotkite {
	public static String time() {
		return new SimpleDateFormat("yyyy-MM-DD HH-MM-SS").format(new Date());
		
	}
	
	public static void Screen(WebDriver driver, String name) throws IOException {
		File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("");
	    FileHandler.copy(source, destination);
		
	}

}
