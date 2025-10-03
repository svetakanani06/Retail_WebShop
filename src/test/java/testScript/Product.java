package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseClass;

public class Product extends BaseClass{

	@Test
	public void TC_PositivePurchase() throws Exception {
		login();
		pageObject.books.click();
		pageObject.AddToCart.click();
		pageObject.ShoppingCart.click();
		pageObject.termOfService.click();
		waitforELementAndClick(pageObject.checkout);
		waitforELementAndClick(pageObject.newAddressContinue);
		waitforELementAndClick(pageObject.shippingContinue);
		waitforELementAndClick(pageObject.shippingMethodContinue);
		waitforELementAndClick(pageObject.paymentMethodContinue);
		waitforELementAndClick(pageObject.paymentInfoContinue);
		waitforELementAndClick(pageObject.confirmOrder);
		Thread.sleep(2000);
		String ExpectedMsg = "Your order has been successfully processed!";
		String successMsg = pageObject.successMSG.getText();
		System.out.println(successMsg);
		Assert.assertEquals(successMsg.equals(ExpectedMsg), true);
		waitforELementAndClick(pageObject.continueBTN);

	}
	
	@Test
	public void TC_invalidCardPayment() throws Exception {
		login();
		pageObject.books.click();
		pageObject.AddToCart.click();
		pageObject.ShoppingCart.click();
		pageObject.termOfService.click();
		waitforELementAndClick(pageObject.checkout);
		waitforELementAndClick(pageObject.newAddressContinue);
		waitforELementAndClick(pageObject.shippingContinue);
		waitforELementAndClick(pageObject.shippingMethodContinue);
		waitforELementAndClick(pageObject.paymentMethod2_creditCard);
		waitforELementAndClick(pageObject.paymentMethodContinue);
		waitforELementAndSendKeys(pageObject.cardHolderName, "XYZZ");
		waitforELementAndSendKeys(pageObject.CardNumber, "12345678901234");
		waitforELementAndSendKeys(pageObject.CardCode, "2134");
		waitforELementAndClick(pageObject.paymentInfoContinue);
		waitforELement(pageObject.wrongCardMsg);
		Assert.assertEquals(pageObject.wrongCardMsg.getText(), "Wrong card number");
		
	}
}
