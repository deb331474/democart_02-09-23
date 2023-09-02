package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends BasePage{

	public ComponentsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Components'])[1]")
	WebElement componentsLink;
	
	@FindBy(xpath = "//a[normalize-space()='Monitors (2)]")
	WebElement monitorLink;
	
	Actions act=new Actions(driver);
	
	public void moveToMonitorLink() {
		
		act.moveToElement(componentsLink).moveToElement(monitorLink).build().perform();
		
	}
	
	
	

}
