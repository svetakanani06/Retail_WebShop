package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static PageObject pageObject;

	public static void loadProperties() throws IOException {
		FileInputStream file = new FileInputStream("config.properties");
		prop = new Properties();
		prop.load(file);
	}

	@BeforeClass
	public void launchBrowser() throws Exception {
		loadProperties();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		loadProperties();
		pageObject = PageFactory.initElements(driver, PageObject.class);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	public void login() throws Exception {
		pageObject.LoginBTN.click();
		Thread.sleep(1000);
		pageObject.Log_Email.sendKeys(prop.getProperty("username"));
		pageObject.Log_Pass.sendKeys(prop.getProperty("pass"));
		pageObject.Log_Remember.click();
		pageObject.Login_BTN.click();
	}

	public static void waitforELementAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		element1.click();
	}

	public static void waitforELementAndSendKeys(WebElement element, String data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		element1.sendKeys(data);
	}

	public static void waitforELement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean elementVisibleAndEnable(WebElement element) {
		if(element.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
