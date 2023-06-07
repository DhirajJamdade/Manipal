package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPEN BROWSER AND LAUNCH WEBSITE
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	      Select sel = new Select(driver.findElement(By.name("country")));
	    // Select dropdown = new Select(WebElement);
	      
	     sel.selectByValue("ALBANIA");
	     

	}
}