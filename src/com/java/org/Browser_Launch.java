package com.java.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Project_Seleniumm\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMIs7Czq7b_7wIVzjMrCh3P0wagEAAYASAAEgK07PD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIs7Czq7b_7wIVzjMrCh3P0wagEAAYASAAEgK07PD_BwE");
		
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.decathlon.in/");
		
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C256741341320%7Ce%7Cfacebook%7C&placement=&creative=256741341320&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI15KahLz_7wIVmIZLBR3muQbmEAAYASAAEgJE3PD_BwE");
	
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//String title = driver.getTitle();
		//System.out.println("Title  :"+ title);
		//System.out.println("Title  :"+driver.getTitle());
		
	    //driver.getTitle();
		
		//driver.navigate().refresh();
		
		//driver.close();
		
		//driver.navigate().to("https://www.instagram.com/");
		
		//driver.switchTo();
		
		//driver.quit();
	}
	

}
