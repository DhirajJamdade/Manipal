package ManialObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceVerifyLogo {
	WebDriver driver;

	public SauceVerifyLogo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Verify SauceLogo
	
	@FindBy(xpath="//img[@src='/Themes/DefaultClean/Content/images/logo.png']")
	public WebElement SauceDemoLogo;
	
	public void VerifySauceDemoLogo() {
	System.out.println(SauceDemoLogo.isDisplayed()); 
	Assert.assertTrue(SauceDemoLogo.isDisplayed(), "SauceDemoLogo is not Displayed");
	}
	
	//Verify Register Button
	
	@FindBy(xpath="register-//*[text()='Register']")
	public WebElement Register;
	
	public void VerifyRegisterButton() {
	System.out.println(Register.isDisplayed()); 
	Assert.assertTrue(Register.isDisplayed(), "Register is not Displayed");
	}
	
    //Verify Login Button
	@FindBy(xpath="login-//*[text()='Log in']")
	public WebElement Login;
	
	public void VerifyLoginButton() {
	System.out.println(Login.isDisplayed()); 
	Assert.assertTrue(Login.isDisplayed(), "Login is not Displayed");
	}
	
	@FindBy(xpath="shoping cart-//*[text()='Shopping cart'][1]")
	public WebElement  ShoppingCart;
	
	public void VerifyShoppingCartButton() {
	System.out.println(ShoppingCart.isDisplayed()); 
	Assert.assertTrue(ShoppingCart.isDisplayed(), "ShoppingCart is not Displayed");
	}
	
	@FindBy(xpath="//*[text()='Wishlist'][1]")
	public WebElement WishList;
	
	public void VerifyWishList() {
	System.out.println(WishList.isDisplayed()); 
	Assert.assertTrue(WishList.isDisplayed(),"Wishlist is not Displayed");
	}
	
	@FindBy(xpath="//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	public WebElement Computers;
	public void HoverComputerButton() {
		 Actions act = new Actions (driver);
		    // act.contextClick(button).perform();
		     act.moveToElement(Computers).perform();

	 // Computers.click();
	}
	
	@FindBy(xpath=("//a[@href='/desktops'])[1]"))
	public WebElement Desktop;
	public void DesktopButton() {
	  Computers.click();
	}
}
