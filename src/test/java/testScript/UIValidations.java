package testScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.BaseClass;

public class UIValidations extends BaseClass{
	@Test
	public void TC_BTN_Validation() throws Exception {
		waitforELement(pageObject.books);
		List<WebElement> navigationBarButtons = pageObject.NavigationBarButtons;
		System.out.println(navigationBarButtons.size());
		for(WebElement button : navigationBarButtons) {
			System.out.println(button.getText());
			Assert.assertEquals(elementVisibleAndEnable(button), true);
		}
	}
}
