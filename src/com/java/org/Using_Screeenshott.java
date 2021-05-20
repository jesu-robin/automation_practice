package com.java.org;

import java.awt.AWTException;
import java.io.IOException;
import com.javaa.org.Base_Class;

public class Using_Screeenshott extends Base_Class{
	
	public static void main(String[] args) throws IOException, AWTException {
		
		Launch_Browser("chrome");
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		toScreenshot("C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\screenshot\\fb.png");
		
		toClose();
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source =ts.getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\screenshot\\facebook.png");
//		
//		FileUtils.copyFile(source, destination);
//		
		
	}

}
