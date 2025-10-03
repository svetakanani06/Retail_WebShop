package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseClass;
import utility.PageObject;

public class User_Registration extends BaseClass{

	public PageObject pageObject;
	WebDriver driver;
	
	@Test
	public void tc_1_Register() throws InterruptedException {
		
		waitforELementAndClick(pageObject.registerBtn);
		waitforELementAndClick(pageObject.Reg_Female);
		waitforELementAndSendKeys(pageObject.Reg_FirstName,"ABC");
		waitforELementAndSendKeys(pageObject.Reg_LastName,"XYZ");
		waitforELementAndSendKeys(pageObject.Reg_Email, prop.getProperty("username"));
		waitforELementAndSendKeys(pageObject.Reg_Pass, prop.getProperty("pass"));
		waitforELementAndClick(pageObject.Reg_RegisterBTN);
		Assert.assertEquals(pageObject.Reg_SuccessMsg.getText().trim(), "Your registration completed");
		waitforELementAndClick(pageObject.Reg_Continue);
		waitforELementAndClick(pageObject.Reg_Logout);
		
	}
}
