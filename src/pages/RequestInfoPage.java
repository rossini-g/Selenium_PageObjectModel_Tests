package pages;

import org.openqa.selenium.WebDriver;

public class RequestInfoPage extends BasePage {

	private RequestInfoPageSelectors selector;
	public RequestInfoPage (WebDriver driver) {
		super(driver);
		selector = new RequestInfoPageSelectors();
	}
	
	public void fillOutForm() {
		// filling out textbox
		findElement(selector.emailInput).sendKeys("test@test.com");
		findElement(selector.phoneNumberInput).sendKeys("2069999999");
		findElement(selector.companyNameInput).sendKeys("test Company");
		findElement(selector.cityInput).sendKeys("Seattle");
		findElement(selector.zipCodeInput).sendKeys("98133");
		findElement(selector.stateInput).sendKeys("WA");
		findElement(selector.countryInput).sendKeys("USA");
		
		// TODO add object for drop-downs, and lists (radio buttons and checkboxes)
		// choose from list
		scrollToElement(selector.numFlightsDropDown).click();
		findElement(selector.numFlights10plus, true).click();
		
		scrollToElement(selector.secondHomeDropDown).click();
		findElement(selector.secondHomeYes, true).click();
		
		scrollToElement(selector.leadSourceDropdown).click();
		findElement(selector.leadSourceAdvertisement, true).click();
		
		// select check boxes/radio buttons
		scrollToElement(selector.leadTravelByCharterCheckbox).click();
		scrollToElement(selector.interestCoreCheckbox).click();
		scrollToElement(selector.petsYesRadioButton).click();
	}
	
	public CoreMembershipPage clickXButton() {
		findElement(selector.xButton).click();
		return new CoreMembershipPage(driver); 
    }
	
}
