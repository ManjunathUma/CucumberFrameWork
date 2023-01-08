package MyHooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AmazonHooks {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Launching a application");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("close the browser");
    }

}
