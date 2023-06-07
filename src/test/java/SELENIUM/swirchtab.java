package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swirchtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver = new ChromeDriver(); 
		     driver.get("https://www.google.com");
		     driver.findElement(By.LinkText ("Gmail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

		  // windowHandles () gets you the details of all the session ID of the tab that

		  // are open right now

		  String parent driver.getWindowHandle(); System.out.println(parent);

		  Set<String> windowsID= driver.getWindowHandles();

		  Iterator<String>it windowsID.iterator();

		  while (it.hasNext()) {

		  I

		  String child it.next(); if (Iparent.equals(child))

		  driver.switchTo().window(child);

		  // driver.findElement(By.xpath("//*[@data-action='sign in']")).click();

		  }

		  }

		  driver.findElement(By.xpath("//*[@data-action='sign in']")).click();

		  driver.switchTo().window(parent);
	}

}
