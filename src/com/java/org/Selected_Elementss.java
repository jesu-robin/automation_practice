package com.java.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selected_Elementss {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//a[@rel='async']"));
		signup.click();
		
		Thread.sleep(4000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("rob");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("j");
		
		Thread.sleep(5000);
		
		WebElement num = driver.findElement(By.name("reg_email__"));
		num.sendKeys("jesurobinmech1@gmail.com");
		
		WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
		reenter.sendKeys("jesurobinmech1@gmail.com");
		
		Thread.sleep(4000);
		
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("123456");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("2");
		
		WebElement month = driver.findElement(By.xpath("//select [contains(@class,'_9407 ')]"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1996");
		
		WebElement sex = driver.findElement(By.xpath("(//input [@type='radio'])[2]"));
		sex.click();
		
		WebElement sign = driver.findElement(By.name("websubmit"));
		sign.click();
	}
	
	
	
	

}
