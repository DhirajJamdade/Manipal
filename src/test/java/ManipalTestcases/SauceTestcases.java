package ManipalTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import MANIPALbase.BaseClassSauceDemo;
import ManialObjects.NewpageDesktop;
import ManialObjects.SauceVerifyLogo;

public class SauceTestcases extends BaseClassSauceDemo {
	
	public SauceVerifyLogo myhomeObj;
	public NewpageDesktop mypageObj;
	WebDriver driver;

	
	/* gave the memory to pageObjects */
	@BeforeMethod
	public void initial() {
		driver = getDriver();
		myhomeObj = new SauceVerifyLogo(driver);
		mypageObj = new NewpageDesktop(driver);

	}

	
	@Test
	public void myscenario() {
		myhomeObj.VerifySauceDemoLogo();
		myhomeObj.VerifyRegisterButton();
		myhomeObj.VerifyWishList();
		myhomeObj.VerifyShoppingCartButton();
		myhomeObj.HoverComputerButton();
		myhomeObj.DesktopButton();
		mypageObj.ClickOnAddToCart();
	}
}


