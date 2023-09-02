package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{
	
	public LogOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[text()='Logout'])[2]")
	WebElement logOutLink;
	
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement logOutContinue;
	
	
	@FindBy(xpath = "//h1[text()='Account Logout']")
	WebElement cnfrmLogoutText;
	
	public void clickLogout() {
		logOutLink.click();
	}
	
	public void clickCnfrmContinue() {
		logOutContinue.click();
	}
	
	public String getMessage() {
		return cnfrmLogoutText.getText();
	}


}
