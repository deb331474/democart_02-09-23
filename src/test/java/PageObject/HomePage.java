package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccountLink;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement RegisterLink;
	
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	WebElement LoginLink;
	
	
	
	// Action Methods
		public void clickMyAccount() {
			MyAccountLink.click();
		}

		public void clickRegister() {
			RegisterLink.click();
		}
		
		public void Loginlink() {
			LoginLink.click();
		}

}
