package pages;

import org.openqa.selenium.WebDriver;

/**
 * @author Rossini Higgins
 *
 */
public class CoreMembershipPage extends BasePage{

	private CoreMembershipPageSelectors selector;
	public CoreMembershipPage (WebDriver driver) {
		super(driver);
		selector = new CoreMembershipPageSelectors();
	}
	
	public RequestInfoPage clickContinue() { 
		findElement(selector.continueButton).click();
		return new RequestInfoPage(driver);
    }
	
	public void scrollToBecomingAMember() { 
		scrollToElement(selector.becomeWheelsUpMemberHeading); 
    }
	
	public void scrollToLearnMoreToday() { 
		scrollToElement(selector.learnTodayText); 
    }
	
	public void inputFirstName(String firstName) { 
		findElement(selector.firstNameInput).sendKeys(firstName);
    }
	
	public void inputLastName(String lastName) { 
		findElement(selector.lastNameInput).sendKeys(lastName); 
    }
	
}
