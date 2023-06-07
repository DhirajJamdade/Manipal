package SELENIUM;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class FirstFirefox {

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver","\\geckodriver.exe");
			
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.flipkart.com/");


		}

	}
