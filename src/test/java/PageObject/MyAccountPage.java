package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "(//div[@id='content']/h2)[1]")
	WebElement myAccountHeading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement linkLogout;

	public boolean isMyAccountPageExists() {
		try {
			return (myAccountHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	public void clickLogout() {
		linkLogout.click();

	}
	

}
