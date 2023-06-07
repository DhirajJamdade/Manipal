package ManipalTestcases;
public class Testcases {
	
	public class Testcases extends BaseConfigurations {
		
		
		
		public HomePage homeObj;

			public Hamburger menuObj;
            public AllMobiles mobileObj; 
			WebDriver driver;

			//7 gave the memory to pageObjects 
            
			 @BeforeMethod
			public void initialisetup() {
			driver = getDriver();
			homeObj = new Homepage (driver);
			menuobj =new Hamburger (driver); 
			mobileobj= new AllMobiles (driver);
			 }
			//TestCase 17

			@Test 
			public void scenario1() { 
		    homeobj.verifyHomeLaunchSuccess();
			menuObj.menuNavigation(); 
			mobileobj.verifyMobileHeader();
}
}
}