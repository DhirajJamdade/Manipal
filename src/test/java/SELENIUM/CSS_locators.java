package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSS_locators {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com");
			driver.findElement(By.cssSelector("input#user-name")).sendKeys("problem_user");
			driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
			driver.findElement(By.cssSelector("input#login-button")).click();
	  //      driver.findElement(By.id("Login")).click();


}
}