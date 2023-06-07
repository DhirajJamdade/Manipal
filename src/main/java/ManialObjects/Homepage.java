package ManialObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="nav-link-accountList")
	public WebElement signInButton;
	
	public void VerifyHomeLaunchSuccess() {
	System.out.println(signInButton.isDisplayed()); 
	Assert.assertTrue(signInButton.isDisplayed(), "It is not Displayed");
	}
}
