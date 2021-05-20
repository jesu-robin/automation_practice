package com.base.org;

	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Base_Class1 {
	    
		public static WebElement element;
		public static WebDriver driver;
		public static Actions a;
		public static Select s;
	    public static Robot r;
	// browser launch

		public static WebDriver Launch_Browser(String browser) throws AWTException {

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriverserver.exe");
				driver = new InternetExplorerDriver();
			}

			else if (browser.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			else {
				System.out.println("BROWSER INVALID");
			}
			//a = new Actions(driver);
			//r = new Robot();

			driver.manage().window().maximize();

			return driver;

		}

	// url launch(get)
		
		public static void Launch_Url(String url) {
			driver.get(url);
		}

	// sendkeys
		public static void Type_Text(WebElement ref_Name, String type) {
			ref_Name.sendKeys(type);
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



	// close
		public static void toClose() {
			driver.close();
		}

	// quit
		public static void toQuit() {
			driver.quit();
		}

	// navigate to
		public static void toNavigation(String text) {
			driver.navigate().to(text);
		}

	// navigate back
		public static void toNavigateBack() {
			driver.navigate().back();
		}

	// navigate refresh
		public static void toNavigateRefresh() {
			driver.navigate().refresh();
		}

	// navigate forward
		public static void toNavigateForward() {
			driver.navigate().forward();
		}

	// alert
		public static Alert alert; 

	// ok (simple, confirm)
		public static void toAlertAccept() {
			alert = driver.switchTo().alert();
			alert.accept();

		}

	// dismiss(confirm)
		public static void toAlertDismiss() {
			alert.dismiss();
		}

	// prompt accept
		public static void toPromptaccept(String type) {
			alert.sendKeys(type);
			alert.accept();

		}

		public static void toPromptdismiss(String type) {
			alert.sendKeys(type);
			alert.dismiss();

		}

	// frames
		public static void toFrames(WebElement frame) {
			driver.switchTo().frame(frame);

		}

	// robot

		public static void toRobotize() throws AWTException {
			r = new Robot();

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		public static void toEnter() throws AWTException {
		
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}


		

	//get title	
		public static void toget_title() {
			String title = driver.getTitle();
			System.out.println("Title   :"+title);

		}

	//get current url	
		public static void toGet_Currenturl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current Url   :"+currentUrl);

		}



	//is displayed
		public static void toSee_Displayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			System.out.println("Is Displayed   :"+displayed);
			

		}

	//is enabled	
		public static void toSee_enabled(WebElement element) {
			boolean enabled = element.isEnabled();
			System.out.println("Is Enabled   :"+enabled);
		}

	//is selected	
		public static void toSee_Selected(WebElement element) {
			boolean selected = element.isSelected();
			System.out.println("Is Selected   :"+selected);
		}
		
	//get text
		public static void toGet_Text(WebElement element) {
			String text = element.getText();
			System.out.println("Texts are   :"+text);
		}

	//get attribute
		public static void toSee_(WebElement element, String attributetype) {

			element.getAttribute(attributetype);
		}

	//take screen shot

		
		public static void toScreenshot(String address) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(address);
			FileUtils.copyFile(source, destination);
		}
		
		//select single drop down

			public static void toDropdownvalue(WebElement element, String value) {
				s = new Select(element);
				s.selectByValue(value);

			}

			public static void toDropdownindex(WebElement element, int value) {
				s = new Select(element);
				s.selectByIndex(value);

			}

			public static void toDropdowntext(WebElement element, String text) {
				s = new Select(element);
				s.selectByVisibleText(text);
			}
		
	//select is multiple

		public static void tosee_Multiple(WebElement element) {
			s = new Select(element);
			boolean m = s.isMultiple();
			System.out.println("Multiple   :"+m);
			
			
		}


		public static void toGet_Allselectedoptions() {
			
			List<WebElement> options = s.getOptions();
			for (WebElement getoptions : options) {
				String text = getoptions.getText();
				System.out.println("All options   :"+text);
			}
		}
			public static void toGet_Firstselectedoptions() {
				
				WebElement first = s.getFirstSelectedOption();
				String text = first.getText();
				System.out.println("First Selected Option   :"+text);
			
		}
		
			//get window handles
			public static void toWindow_Handles(String id) {

				Set<String> windowHandles = driver.getWindowHandles();
				for (String allwindows : windowHandles) {
					String title = driver.switchTo().window(allwindows).getTitle();
					System.out.println("Titles   :"+title);
					
					}
				String actualtitle = id;
				
				for (String actualwindow : windowHandles) {
					if (driver.switchTo().window(actualwindow).getTitle().equals(actualtitle)) {
						
						break;
					}
					
				}
				
			}
			
			

			
			//public static void ToScroll() {
				
				

				
			//}
		
	


}
