package com.java.org;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.javaa.org.Base_Class;

public class Using_Action extends Base_Class {

		public static void main(String[] args) throws  AWTException {
		
			Launch_Browser("chrome");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//Actions a = new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		
		WebElement fash = driver.findElement(By.linkText("Fashion"));
		mouse_Contextclick(fash);
		//a.contextClick(fash).build().perform();
		
		//Robot r = new Robot();
		toRobotdown();
		
	//	r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		torobotEnter();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement cus = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
		a.contextClick(cus).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement newr = driver.findElement(By.linkText("New Releases"));
		a.contextClick(newr).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement elec = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]"));
		a.contextClick(elec).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> window = driver.getWindowHandles();
		
		for (String getall : window) {
			
			driver.switchTo().window(getall);
			toget_title();
			
			//System.out.println(title);
			
		}
		
	    String s="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	    for (String actualid : window) {
	    	driver.switchTo().window(actualid);
	    	if (s.equals(actualid)) {
	    		toget_title();
	    		break;
			}
			
		}
	    
		 
		
	}
	
	
	
}
