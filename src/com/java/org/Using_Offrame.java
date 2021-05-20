package com.java.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Offrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement frmae = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(frmae);
		
		WebElement key = driver.findElement(By.xpath("//input[@type='text']"));
		key.sendKeys("robin");
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		WebElement nested = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		nested.click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame1);
		 
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement ok2 = driver.findElement(By.xpath("//input[@type='text']"));
		ok2.sendKeys("robinn");
		
		driver.switchTo().defaultContent();
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/i"));
		drop.click();
		
		WebElement aa = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		aa.click();
		
		driver.navigate().back();
		WebElement home = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[1]/a"));
		home.click();
		
		
	
		
	}

}
