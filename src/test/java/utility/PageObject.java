package utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PageObject {

	//Register WebElement
	@FindBy(linkText="Register")
	public WebElement registerBtn;
	
	@FindBy(id="gender-female")
	public WebElement Reg_Female;
	
	@FindBy(id="gender-male")
	public WebElement Reg_Male;
	
	@FindBy(id="FirstName")
	public WebElement Reg_FirstName;
	
	@FindBy(id="LastName")
	public WebElement Reg_LastName;
	
	@FindBy(id="Email")
	public WebElement Reg_Email;
	
	@FindBy(id = "Password")
	public WebElement Reg_Pass;
	
	@FindBy(id="ConfirmPassword")
	public WebElement Reg_ConfirmPass;
	
	@FindBy(id= "register-button")
	public WebElement Reg_RegisterBTN;
	
	@FindBy(xpath="//div[@class='result']")
	public WebElement Reg_SuccessMsg;
	
	@FindBy(xpath="//input[@class='button-1 register-continue-button']")
	public WebElement Reg_Continue;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	public WebElement Reg_Logout;
	
	//Login WebElement 
	@FindBy(xpath= "//a[text()='Log in']")
	public WebElement LoginBTN;
	
	@FindBy(id="Email")
	public WebElement Log_Email;
	
	@FindBy(id="Password")
	public WebElement Log_Pass;
	
	@FindBy(id="RememberMe")
	public WebElement Log_Remember;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	public WebElement Login_BTN;
	
	//homePage WebElement
	@FindBy(id="small-searchterms")
	public WebElement home_SearchBar;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement home_SearchBTN;
	
	@FindBy(xpath="//h2[@class='product-title']")
	public List<WebElement> productLST;
	
	@FindBy(id="products-orderby")
	public WebElement sortBy;
	
	@FindBy(xpath = "//a[@href='/books']")
	public WebElement books;
	
	//add to cart
	@FindBy(xpath="//input[@value='Add to cart']")
	public WebElement AddToCart;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	public WebElement ShoppingCart;
	
	
	//product text
	@FindBy(xpath="//div[@class='details']")
	public WebElement booktext;
	
	@FindBy(xpath="//a[@class='product-name']")
	public WebElement cartProducts;
	
	@FindBy(id="checkout")
	public WebElement checkout;
	
	@FindBy(id="termsofservice")
	public WebElement termOfService;
	
	@FindBy(xpath= "//input[@class='button-1 new-address-next-step-button']")
	public WebElement newAddressContinue;
	
	@FindBy(xpath="//div[@id='shipping-buttons-container']//input")
	public WebElement shippingContinue;
	
	@FindBy(xpath="//div[@id='shipping-method-buttons-container']//input")
	public WebElement shippingMethodContinue;
	
	@FindBy(xpath="//div[@id='payment-method-buttons-container']//input")
	public WebElement paymentMethodContinue;
	
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']//input")
	public WebElement paymentInfoContinue;
	
	@FindBy(xpath="//div[@id='confirm-order-buttons-container']//input")
	public WebElement confirmOrder;
	
	@FindBy(xpath="//div[@class='title']/strong")
	public WebElement successMSG;
	
	@FindBy(xpath="//div[@class='buttons']/input")
	public WebElement continueBTN;
	
	//Payment method validation
	@FindBy(xpath="//input[@id='paymentmethod_1']")
	public WebElement paymentMethod1_MoneyOrder;
	
	@FindBy(xpath="//input[@id='paymentmethod_2']")
	public WebElement paymentMethod2_creditCard;
	
	@FindBy(id="CardholderName")
	public WebElement cardHolderName;
	
	@FindBy(id="CardNumber")
	public WebElement CardNumber;
	
	@FindBy(id="CardCode")
	public WebElement CardCode;
	
	@FindBy(xpath="//div[@class='validation-summary-errors']//li")
	public WebElement wrongCardMsg;
	
	@FindBy(xpath="//a[text()='Log out']")
	public WebElement logout;
	
	//UI Validations
	@FindBy(xpath="//div[@class='header-menu']/ul[1]/li/a")
	public List<WebElement> NavigationBarButtons;
	
}
