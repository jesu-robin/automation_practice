package com.java.org;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Use_Multiples {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement multiple = driver.findElement(By.name("States"));
		Select s = new Select(multiple);
		boolean m = s.isMultiple();
		System.out.println("Is Multiple?  "+ m);
		
		System.out.println("*****Get Options*****");
		List<WebElement> options = s.getOptions();
		for (WebElement getoptions : options) {
			String text = getoptions.getText();
			System.out.println(text);
			
		}
		
		int size = options.size();
		System.out.println("Size:  "+size);
		
		for (int i = 0; i <=size; i++) {
			if (i==1 || i==3 || i==4) {
				s.selectByIndex(i);
				
			}
			
		}
		
		List<WebElement> alloptn = s.getAllSelectedOptions();
		for (WebElement getall : alloptn) {
			System.out.println(getall.getText());
			
		}
		
		int size2 = alloptn.size();
		System.out.println("Size2:"  +size2);
		
		WebElement fSelOptn = s.getFirstSelectedOption();
		String t = fSelOptn.getText();
		System.out.println(t);
		
		//driver.close();
	}

}

