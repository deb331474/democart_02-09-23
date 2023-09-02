package testCases;

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

public class TC_002_LogInTest extends BaseClass {

	@Test
	public void LoginTest() throws InterruptedException {

		try {
			logger.debug("application logs");
			logger.info("Starting Test case 002");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();

			hp.Loginlink();

			LogInPage lp = new LogInPage(driver);

			lp.setEmail("prusethdebasish@gmail.com");
			lp.setPassword("Debudon@211");

			lp.clickLogin();

			String myAccount = lp.getConfirmationMsg();
			myAccount.trim();

			Assert.assertEquals(myAccount, "My Account");
			
			LogOutPage lop=new LogOutPage(driver);
			
			lop.clickLogout();
			Thread.sleep(5000);
			
			lop.clickCnfrmContinue();
			
			logger.info("Logout Test executed");
			
			
		} catch (Exception e) {

			e.getMessage();
		}

	}

}
