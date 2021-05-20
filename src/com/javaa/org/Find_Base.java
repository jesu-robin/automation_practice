package com.javaa.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Find_Base {
	public static WebDriver driver;
	public static Actions a;
	
	// find element
			public static WebElement element1, element2, element3;

			public static void totake_Element(WebElement element, String copy) {

				if (element == element1) {
		element1 = driver.findElement(By.xpath(copy));
				} else if (element == element2) {
					element2 = driver.findElement(By.name(copy));

			} else if (element == element3) {
			element3 = driver.findElement(By.id(copy));

				} else {
					System.out.println("elemnet is not available");
				}
			}
			
			
			// click
			public static void click(WebElement ref_Name) {
				ref_Name.click();
			}
			
			
			
			// actions
			// move to element
				public static void mouse_Movetoelement(WebElement ref_Name) {
					a = new Actions(driver);
					a.moveToElement(ref_Name).build().perform();
				}

			// click using mouse
				public static void mouse_Click(WebElement ref_Name) {
					a.click(ref_Name).build().perform();
				}

			// context click
				public static void mouse_Contextclick(WebElement ref_Name) {
					a.contextClick(ref_Name).build().perform();
				}


}
