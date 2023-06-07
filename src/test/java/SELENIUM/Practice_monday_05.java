package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_monday_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.amazon.in/");
	     
	     
	 
	     driver.findElement(By.id("nav-hamburger-menu")).click();
	     driver.findElement(By.className("nav-sprite hmenu-arrow-next")).click();

	     WebElement button = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[@class='nav-line-2 ']"));
	     if (button.isDisplayed()) {
	            System.out.println("Button is visible");
	        } else {
	            System.out.println("Button is not visible");
	        }
	        driver.quit();	 
	      
}
}