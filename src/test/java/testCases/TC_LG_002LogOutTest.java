package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LogInPage;
import PageObject.LogOutPage;
import testBase.BaseClass;

public class TC_LG_002LogOutTest extends BaseClass {

	@Test
	public void LogOutTest() throws InterruptedException,SocketException{

			logger.debug("application logs");
			logger.info("Starting Test case LG_002");
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.Loginlink();
			logger.info("Clicked on the login link");
			
			LogInPage lp=new LogInPage(driver);
			lp.setEmail("prusethdebasish@gmail.com");
			lp.setPassword("Debudon@211");
			lp.clickLogin();
			
			logger.info("Login Data entered successfully");
			
			LogOutPage lop=new LogOutPage(driver);
			
			lop.clickLogout();
			Thread.sleep(5000);
			
			lop.clickCnfrmContinue();
			
			logger.info("Logout Test executed");

	}

}
