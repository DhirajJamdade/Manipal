package SELENIUM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwaglabsFriday {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPEN BROWSER AND LAUNCH WEBSITE
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\djamd\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
	     driver.get("https://www.saucedemo.com/");
	     
	     //ENTER LOGIN DETAILS
	     
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     driver.findElement(By.id("login-button")).click();
	     
	     //ADD PRODUCTS TO THE CART
	     
	     driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	     driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	     driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	     driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	     driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	     driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	     driver.findElement(By.className("shopping_cart_link")).click();
	     
	     
	    //REMOVE PRODUCTS FROM THE CART
	    
	    driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	    driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
	    driver.findElement(By.id("remove-sauce-labs-onesie")).click();
	    driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
	    driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
	    driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
	    
	    //Go back to Shopping Page 
	    driver.findElement(By.id("continue-shopping")).click();
	    
	    //AGAIN ADD PRODUCTS TO THE CART
	    
	    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	    driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	    driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	    driver.findElement(By.className("shopping_cart_link")).click();
	    
	    //CHECKOUT
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.id("first-name")).sendKeys("DHIRAJ");
	    driver.findElement(By.id("last-name")).sendKeys("JAMDADE");
	    driver.findElement(By.id("postal-code")).sendKeys("4116115");
	    driver.findElement(By.id("continue")).click();
	    
	    driver.findElement(By.id("finish")).click();
	   
	}

}
