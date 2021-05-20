package com.java.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Checks {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driverr = new ChromeDriver();
		
		driverr.get("https://www.decathlon.in/");
		
		driverr.manage().window().maximize();
		
		//String title = driverr.getTitle();
		//System.out.println("TITLE :"+ title);
		
		WebElement x = driverr.findElement(By.xpath("//input [@type='type']"));
		x.sendKeys("shoe");
		
		WebElement xx = driverr.findElement(By.xpath("(//p [@class='m-0'])[1]"));
		xx.click();
		
		//WebElement xxx = driverr.findElement(By.xpath("//li [@class='active ']"));
		//xxx.click();
		
		WebElement xxxx = driverr.findElement(By.xpath("//div [@class='btn-close float-right']"));
		xxxx.click();
		
		
		
	}
}
