package MANIPALbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClassSauceDemo {
	
	
	@Test
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://demowebshop.tricentis.com/");
		return driver;
		System.print.out("kdnc")
	}
}
