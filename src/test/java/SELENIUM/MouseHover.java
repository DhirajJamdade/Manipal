package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver(); 
		     driver.get("https://www.amazon.in/");
		     WebElement button = driver.findElement(By.id("nav-link-accountList"));
		 
		//     WebElement button = driver.findElement(By.xpath("//a[@id=nav-link-accountList]"));

		     Actions act = new Actions (driver);
		    // act.contextClick(button).perform();
		     act.moveToElement(button).perform();
		     
	}

}