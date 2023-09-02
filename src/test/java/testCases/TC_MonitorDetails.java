package testCases;

import java.net.SocketException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LogInPage;
import PageObject.MonitorDetailsPage;
import testBase.BaseClass;

public class TC_MonitorDetails extends BaseClass {
	
	@Test
	public void accessMonitorDetails() throws Exception {
		
		try {
		logger.info("Starting Test case TC_MonitorDetails");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.Loginlink();
		logger.info("Clicked on the login link");
		
		LogInPage lp=new LogInPage(driver);
		lp.setEmail("prusethdebasish@gmail.com");
		lp.setPassword("Debudon@211");
		lp.clickLogin();
		
		logger.info("Login Data entered successfully");
		
		Thread.sleep(5000);
		
		MonitorDetailsPage mp=new MonitorDetailsPage(driver);
		mp.clickonMonitorDetsils();
		Thread.sleep(5000);
		List<String> mDetails=mp.allMonitorDetails();
		System.out.println(mDetails);
		logger.info("All monitor Details found");
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
   

}
