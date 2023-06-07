package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fACEBOOKpractice {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html%22");

        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys("23");
        driver.findElement(By.id("cheightfeet")).clear();
        driver.findElement(By.id("cheightfeet")).sendKeys("6");
	}

}