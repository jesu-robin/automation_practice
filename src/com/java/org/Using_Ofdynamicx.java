package com.java.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Ofdynamicx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.decathlon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("//*[@id=\"location-prompt\"]/div/div[1]"));
		close.click();
		
		List<WebElement> all = driver.findElements(By.xpath("//span[@class='mrp before mr-4']//parent::div"));
		
		for (WebElement single : all) {
			
			String text = single.getText();
			
			System.out.println(text);
			
		}
			int size = all.size();
			System.out.println("size  :"+ size);
			
		
		
	}
	
}
