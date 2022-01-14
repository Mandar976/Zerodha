package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	WebDriver driver;
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-DD HH-mm-ss").format (new Date());
	}  
	
	public static void Screenshot(String name,WebDriver driver) throws IOException {
//		Date currentdate = new Date();
//		String date = currentdate.toString().replace(" ","-").replace(" ","-");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Users\\MANDAR\\eclipse-workspace\\java\\src\\KIteZerodha\\Zerodhass\\"+ name + timestamp()+".png");
		FileHandler.copy(source, destination);
		
		
		
		
		
	}

}
