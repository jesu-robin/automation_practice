package com.javaa.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wwww extends Find_Base {
	public static void main(String[] args) throws InterruptedException {
		
	//Launch_Browser("chrome");
	//Launch_Url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		
	driver.manage().deleteAllCookies();

	totake_Element(element1, "//a[@title='Women']");
	mouse_Movetoelement(element1);

	totake_Element(element1, "(//a[@title='T-shirts'])[1]");
	click(element1);
	
	totake_Element(element1, "(//img[@alt='Faded Short Sleeve T-shirts'])[1]");
	mouse_Movetoelement(element1);
	
	totake_Element(element1, "//a[@class='quick-view']");
	click(element1);
	
	totake_Element(element1, "//div[@class='fancybox-overlay fancybox-overlay-fixed']");
	driver.switchTo().activeElement();
	//Thread.sleep(5000);
	//totake_Element(element1, "//div[@class='primary_block row']");
	//driver.switchTo().activeElement();
	
	//totake_Element(element1, "(//p[@class='buttons_bottom_block no-print'])[1]");
	//driver.switchTo().frame(element1);
	
	totake_Element(element1, "//button[@class='exclusive']");
	mouse_Click(element1);
	
	
	}

}
