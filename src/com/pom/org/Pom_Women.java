package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Women {
	
	public static WebDriver driver;
	
	public Pom_Women(WebDriver driver) {

		Pom_Women.driver=driver;
		PageFactory.initElements(driver,this );
	} 
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women ;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement tshirt ;
	
	@FindBy(xpath="//div[@class='product-container']") 
	private WebElement movetoimage ;
	
	@FindBy(xpath="//a[@title='View']")
	private WebElement more ;
	
	@FindBy(xpath="(//img[@alt='Faded Short Sleeve T-shirts'])[5]")
	private WebElement changeimage ;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus ;
	
	

	@FindBy(xpath="//button[@name='Submit']")
	private WebElement cart ;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceed ;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed2 ;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email ;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass ;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement signin ;
	
	
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement proceed3 ;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed4;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement pay ;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement proceed5 ;
	
	
	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getMovetoimage() {
		return movetoimage;
	}

	public WebElement getmore() {
		return more;
	}

	public WebElement getChangeimage() {
		return changeimage;
	}
	
	public WebElement getPlus() {
		return plus;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getProceed5() {
		return proceed5;
	}

	

	

	
	
	

}
