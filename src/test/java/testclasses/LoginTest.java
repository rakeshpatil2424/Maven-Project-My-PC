package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service.Listener;

import extentslistners.Listeners;
import pages.LoginPage2;


public class LoginTest extends Listeners {
//public class LoginTest extends BaseTest {
	@Test(priority =1)
	public void loginToApp() {
		test.info("Entering credentials");
		lp.loginWithCredentials();
		test.info("credentials entered");
		lp.enterpin();
		test.info("pin entered");
	}
	
	@Test(priority = 2)
	public void validatePage() {
	boolean retvalue=lp.veryfyUrl();
	Assert.assertTrue(retvalue);
	}

}
