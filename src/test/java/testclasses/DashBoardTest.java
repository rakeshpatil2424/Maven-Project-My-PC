package testclasses;

import org.testng.annotations.Test;

import extentslistners.Listeners;
public class DashBoardTest extends Listeners {
//public class DashBoardTest extends BaseTest {
	
	@Test(priority=3)
	public void selectshare() throws Throwable {
		test.info("search shares");
		db.searchShare();
	}
	@Test(priority = 4)
	public void buyShare() {
		
		db.buyShare();
	}

}
