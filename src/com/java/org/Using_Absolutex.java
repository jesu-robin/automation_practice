package com.java.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Absolutex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		
		
	}
}
