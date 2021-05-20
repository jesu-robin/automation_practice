package com.javaa.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_Signin {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		WebElement email1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email1.sendKeys("jesu48@gmail.com");
		
		WebElement createAcc = driver.findElement(By.name("SubmitCreate"));
		createAcc.click();
		
		WebElement gender = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(gender));
		
		gender.click();
		
		WebElement cusFname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		cusFname.sendKeys("Peter");
		
		WebElement cusLname = driver.findElement(By.name("customer_lastname"));
		cusLname.sendKeys("john");
		
		WebElement ismail = driver.findElement(By.xpath("//input[@data-validate='isEmail']"));
		ismail.click();
		
		WebElement passCreate = driver.findElement(By.xpath("//input[@data-validate='isPasswd']"));
		passCreate.sendKeys("12345");
		
		WebElement date = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select s1 = new Select(date);
		s1.selectByValue("1");
		
		WebElement month = driver.findElement(By.name("months"));
		Select s2 = new Select(month);
		s2.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("years"));
		Select s3 = new Select(year);
		s3.selectByValue("2021");
		
		WebElement check = driver.findElement(By.name("newsletter"));
		check.click();
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("greentech");
		
		WebElement address1 = driver.findElement(By.name("address1"));
		address1.sendKeys("chennai,000001,greentech");
		
		WebElement address2 = driver.findElement(By.name("address2"));
		address2.sendKeys("hjj,hujju,98,jji,gh");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("chennai");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s4 = new Select(state);
		s4.selectByValue("5");
		
		WebElement zip = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		zip.sendKeys("12345");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select s5 = new Select(country);
		s5.selectByValue("21");
		
		WebElement info = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		info.sendKeys("my number is : 1234567689");
		
		WebElement ph1 = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		ph1.sendKeys("1234567890");
		
		WebElement ph2 = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		ph2.sendKeys("2134567809");
		
		WebElement futureaddress = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		futureaddress.sendKeys("buguh,hvhv,23,xfff");
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		
		
		

		
		
		
	}
	

}
