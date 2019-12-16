package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

	private HomePageSelectors selectors;
	public HomePage (WebDriver driver) {
		super(driver);
		selectors = new HomePageSelectors();
	}
	
	public void navigate() {
		driver.get("https://wheelsup.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(selectors.headingUI));
	}
	
	public CoreMembershipPage clickCorekMembershipOptions() {
		findElement(selectors.membershipOptionsLink).click();
		findElement(selectors.coreMembershipLink).click();
		return new CoreMembershipPage(driver); 
    }
	
	public String getPhoneNumber() { 
		return findElement(selectors.phoneNumberText).getText(); 
    }
	
	public String getHeading() { 
		return findElement(selectors.headingUI).getText(); 
    }
	
	public String getEmail() { 
		return findElement(selectors.emailText).getText(); 
    }
	
	public String getAddress() { 
		return findElement(selectors.addressText).getText(); 
    }
}
