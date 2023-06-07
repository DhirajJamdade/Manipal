package Manipal.Axis_01062023;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TRIAL {
	

//public class TestNGConcepts {
	@Test
	public void trstSceaniol() {
    System.out.println("DJ");
	}
	
	@BeforeMethod
	public void trstScenario2 () {
	    System.out.println("I am Before METHOD");
	}
	
	@AfterMethod
	    public void trstScenario3 () {
		    System.out.println("I am After Method");
	}
	
	@BeforeClass
	public void trstScenario4 () {
	    System.out.println("I am Before Class");	   
}
	@AfterClass
	public void trstScenario5 () {
	    System.out.println("I am After Class");
	}
}

