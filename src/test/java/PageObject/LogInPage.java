package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
	
	public LogInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "input-email")
	WebElement emailAddress;
	
	
	@FindBy(id = "input-password")
	WebElement pswd;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnLogin;
	
	
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement loginCnfrmation;
	

	public void setEmail(String email) {
		emailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		pswd.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (loginCnfrmation.getText());
		}
		catch (Exception e) {
			return(e.getMessage());
		}
	
	}
}
