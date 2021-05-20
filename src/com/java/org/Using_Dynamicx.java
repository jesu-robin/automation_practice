package com.java.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Dynamicx {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("TITLE IS   : "+ title);
		
		List<WebElement> all = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
		List<Integer> prize_list = new ArrayList<>();
		
		for (int i = 0; i < all.size(); i++) {
			
			String text = all.get(i).getText();
			
			System.out.println(text);
			String k = text.replace("Rs. ", "");
			System.out.println(k);
			int value = Integer.parseInt(k);
			prize_list.add(value);
			
		}
		
		System.out.println(prize_list);
		
		System.out.println("SIZE  :"+ prize_list.size());
		
		
		
		System.out.println("Minimum Value   :"+ Collections.min(prize_list));
		
		//driver.close();
		
		
	}

}
