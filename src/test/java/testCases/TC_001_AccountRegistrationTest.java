package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountRegistrationPage;
import PageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test
	public void test_account_Registration() throws InterruptedException
	{
		
		try {
		logger.debug("application logs");
		logger.info("Starting Test case 001");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account link");
		
		hp.clickRegister();
		logger.info("Clicked on register link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Providing customer data");
		
		regpage.setFirstName(randomeString().toUpperCase());
		
		regpage.lastName(randomeString().toUpperCase());
		
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		
		regpage.setConfirmPassword(password);
		
		Thread.sleep(5000);
		regpage.setPrivacyPolicy();
		
		Thread.sleep(5000);
		regpage.clickContinue();
		logger.info("Clicked on continue");
		
        String confmsg=regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		Thread.sleep(5000);
		
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");
	}

}
