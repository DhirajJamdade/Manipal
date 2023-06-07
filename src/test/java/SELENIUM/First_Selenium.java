package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class First_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver(); 
      driver.get("https://www.amazon.in");
      driver.get("https://www.amazon.in/");

      System.out.println(driver.getCurrentUrl());

      System.out.println(driver.getTitle());

      driver.manage().window().maximize();

      System.out.println(driver.findElement(By.id("abc")).isDisplayed());

      driver.findElement(By.id("abc")).isEnabled();

      driver.findElement(By.id("abc")).isSelected();
  
	}

}
