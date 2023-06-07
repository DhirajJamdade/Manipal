package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepractice {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com");
     driver.findElement(By.linkText("Images")).click();
    // driver.findElement(By.partialLinkText("Images")).click();
}
}