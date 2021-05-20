package com.java.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Ofalert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(5000);
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
	    confirm.click();
		
	    Thread.sleep(2000);
	    
		WebElement click2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		click2.click();
		
		//Alert alert2 = driver.switchTo().alert();
		alert1.dismiss();
		
		Thread.sleep(3000);
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		prompt.click();
		
		Thread.sleep(2000);
		
		WebElement click3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		click3.click();
		
		//Alert alert3 = driver.switchTo().alert();
		alert1.sendKeys("im robin");
		alert1.accept();
	
		//String t = alert3.getText();
		//System.out.println(t);
	}

}
