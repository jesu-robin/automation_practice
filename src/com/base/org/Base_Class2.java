package com.base.org;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public  class Base_Class2 {
		
	 public static WebDriver driver=new ChromeDriver();
		
		public static void toWait(int time, String timeunit) {
			
			if (timeunit.equalsIgnoreCase("seconds")) {
				
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			
			}
			else if (timeunit.equalsIgnoreCase("minutes")) {
				
				driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
			}
			else {
				System.out.println("timeunit not valid");
			}
		}
		
		public static void toExplicitwait(int time1,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, time1);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void toWaitt() throws InterruptedException {
			
			driver.wait();
	}
		
		

}
