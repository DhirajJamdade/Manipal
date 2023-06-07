package SELENIUM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	     driver.findElement(By.name("submit")).click();
	     
	      Alert obj=driver.switchTo().alert();
	    //  obj.accept();
	      obj.dismiss();
	}

}
