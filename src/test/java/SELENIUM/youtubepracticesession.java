package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubepracticesession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

   //     driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("username")).sendKeys("dhirajsobf4");
        driver.findElement(By.id("password")).sendKeys("Dhiraj@143");
        driver.findElement(By.id("Login")).click();
	}
}
//class="btn btn-lg btn-ghost-cirrus salesforce-sans-regular   
