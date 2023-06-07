package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/drag_drop.html");
	     WebElement source = 
	     WebElement target = driver.findElement(By.id("amt7"));
	     
	     Actions act = new Actions (driver);
	     act.dragAndDrop(source, target).perform();
	}

}
