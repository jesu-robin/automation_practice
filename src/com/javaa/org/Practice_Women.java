package com.javaa.org;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import com.pom.org.Pom_Women;

public class Practice_Women extends Base_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {

		Launch_Browser("chrome");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Launch_Url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().deleteAllCookies();
		
		Pom_Women p=new Pom_Women(driver);
		mouse_Movetoelement(p.getWomen());
		click(p.getTshirt());
		mouse_Movetoelement(p.getMovetoimage());
		mouse_Click(p.getmore());
		mouse_Movetoelement(p.getChangeimage());
		click(p.getPlus());
		mouse_Click(p.getCart());
		click(p.getProceed());
		click(p.getProceed2());
		Type_Text(p.getEmail(), "jesu48@gmail.com");
		Type_Text(p.getPass(), "12345");
		click(p.getSignin());
		click(p.getProceed3());
		mouse_Click(p.getCheckbox());
		click(p.getProceed4());
		click(p.getPay());
		click(p.getProceed5());

	}

}
