package ManialObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Hamburger {
	WebDriver driver;

	public Hamburger(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement HamburgerMenu;
	public void SelectAll() {
		HamburgerMenu.click();
}
	/*@FindBy(xpath="//*[text()='Mobiles, Computers']")
	public WebElement HamburgerMenu1;
	public void SelectOption() {
		HamburgerMenu1.click();
	}*/
}
