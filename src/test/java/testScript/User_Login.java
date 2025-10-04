package testScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.PageObject;

public class User_Login extends BaseClass{

	@Test
	public void tc_2_Login() throws Exception {
		login();
		pageObject.home_SearchBar.sendKeys("Desktop");
		pageObject.home_SearchBTN.click();
		Select select = new Select(pageObject.sortBy);
		select.selectByVisibleText("Name: A to Z");
		List<WebElement> products = pageObject.productLST;
		for(WebElement product : products) {
			Assert.assertEquals(product.getText().contains("Desktop"), true);
		}	
	}

}
