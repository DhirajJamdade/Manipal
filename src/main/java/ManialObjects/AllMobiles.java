package ManialObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMobiles {
	WebDriver driver;

	public AllMobiles(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Mobiles, Computers']")
	public WebElement MobilesComputers;
	public void SelectOption() {
		MobilesComputers.click();
	}
	
	@FindBy(xpath="(//*[text()='Mobile & Accessories'])[1]]")
	public WebElement allmobilesButton;
	public void SelectOption1() {
		allmobilesButton.click();
	}
	
	/*public void VerifyMobileAndAccesories() {
		System.out.println(signInButton.isDisplayed()); 
		Assert.assertTrue(signInButton.isDisplayed(), "It is not Displayed");
		}*/
}
